package com.ecommerce.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecommerce.base.Base;
import com.ecommerce.pages.AddToCartPage;
import com.ecommerce.pages.Home;
import com.ecommerce.pages.IndexPage;
import com.ecommerce.pages.Login;
import com.ecommerce.pages.ShippingCartPage;
import com.ecommerce.pages.ShippingPage;
import com.ecommerce.pages.WomenPage;

public class AddToCartPageTest extends Base {
	IndexPage index;
	Login login;
	Home home;
    WomenPage women;
    AddToCartPage cart;
    ShippingCartPage shipping_cart;
    ShippingPage shipping;
    
	public AddToCartPageTest() {
		
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void StartUp()  {
		
		intialisation();
		
			
	}
	
	@Test
	public void  clickOnCheckoutTest() throws InterruptedException {
		
		index=new IndexPage();
		login= new Login();
		login=index.clickOnSignin();
		home=login.verifyLogin(prop.getProperty("username"), prop.getProperty("password"));
		women= new WomenPage();
		cart=women.verifyProduct();
		shipping_cart= new ShippingCartPage();
		cart.selectSize();
		cart.selectColour();
		cart.addToCartItem("1");
		cart.clickOnAddtoCartButton();
		shipping_cart= cart.clickOnShippingCartLink();
		
	}
	
	
	
	
	
	
	
	@AfterMethod
	public void TearDown() {
		
		
		driver.quit();
	}

}
