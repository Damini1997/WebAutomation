package com.ecommerce.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecommerce.base.Base;
import com.ecommerce.pages.AddToCartPage;
import com.ecommerce.pages.ForgotPassword;
import com.ecommerce.pages.Home;
import com.ecommerce.pages.IndexPage;
import com.ecommerce.pages.Login;
import com.ecommerce.pages.ShippingCartPage;
import com.ecommerce.pages.ShippingPage;
import com.ecommerce.pages.WomenPage;

public class ShippingCartPageTest extends Base {
	
	IndexPage index;
	Login login;
	ForgotPassword forgot_pass;
	Home home;
    AddToCartPage cart;
    ShippingCartPage shipping_cart;
    ShippingPage shipping;

	public ShippingCartPageTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		
		intialisation();
		index=new IndexPage();
		login= new Login();
		login=index.clickOnSignin();
		home=new Home();
		cart=new AddToCartPage();
		shipping_cart= new ShippingCartPage();
		home=login.verifyLogin(prop.getProperty("username"), prop.getProperty("password"));
		cart=home.clickOnAddToCartBtn();
		cart.selectSize();
		cart.selectColour();
		cart.addToCartItem("1");
		cart.clickOnAddtoCartButton();
		shipping_cart = cart.clickOnShippingCartLink();
	}
	@Test(priority=1,enabled= false)
	public void  getTitleOfPageTest() {
		
		String Actual_Title=driver.getTitle();
		
		String Expected_Title="Shopping Cart Magento Commerce - website to practice selenium "
				+ "| demo website for automation testing | selenium practice sites";
		
	Assert.assertEquals(Actual_Title, Expected_Title, "no matching data found");
		
	}
	
	@Test(priority=2)
	public void verifySubTotalTest() {
		
		String price=shipping_cart.getPriceofElement();
		String qty=shipping_cart.getValuefromQtyBox();
		int actual_subTotal= Integer.parseInt(price.replace("$", ""))*Integer.parseInt(qty);
		int Expected_subTotal=Integer.parseInt(shipping_cart.getValueOfSubTotal());
		
		Assert.assertEquals(actual_subTotal, Expected_subTotal,"value should be matched");
		
		
	}
	
	@Test(priority=3,enabled= false)
	public void updateCartItemsTest() {
		
		shipping_cart.UpdateCartItems("1");
		
	}
	
	
	@Test(priority=4,enabled= false)
	public void clickOnProceedToCheckOutTest() {
		
		
		shipping=shipping_cart.clickOnProceedToCheckOut();
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}


}
