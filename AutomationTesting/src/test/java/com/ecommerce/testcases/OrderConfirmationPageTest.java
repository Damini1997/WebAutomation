package com.ecommerce.testcases;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ecommerce.base.Base;
import com.ecommerce.pages.AddToCartPage;
import com.ecommerce.pages.Home;
import com.ecommerce.pages.IndexPage;
import com.ecommerce.pages.Login;
import com.ecommerce.pages.OrderConfirmationPage;
import com.ecommerce.pages.ReviewPayment;
import com.ecommerce.pages.ShippingCartPage;
import com.ecommerce.pages.ShippingPage;
import com.ecommerce.pages.WomenPage;
import com.ecommerce.utility.TestUtil;

public class OrderConfirmationPageTest  extends Base {
	
	IndexPage index;
	Login login;
	Home home;
    WomenPage women;
    AddToCartPage cart;
    ShippingCartPage shipping_cart;
    ShippingPage shipping;
    ReviewPayment payment;
    OrderConfirmationPage order_confirm;
	
    String SheetName="Shipping Address";
	
	public OrderConfirmationPageTest() {
		
		super();
		
		
	}
	
	@BeforeMethod
	public void startUp() {
		
		intialisation();
		
	}
	
	
	
	@DataProvider
	public Object[][] getTestData() throws InvalidFormatException {
		
		Object data[][]=TestUtil.getTestData(SheetName);
		return data;
	}
	
	@Test(dataProvider="getTestData")
	public void OrderConfirmationMsgTest(String Street_Address,String City,String state, String zip,String phone_no) throws InterruptedException {
		

		index=new IndexPage();
		login= new Login();
		login=index.clickOnSignin();
		home=login.verifyLogin(prop.getProperty("username"), prop.getProperty("password"));
		women= new WomenPage();
		cart= new AddToCartPage();
		cart=women.verifyProduct();
		cart.selectSize();
		cart.selectColour();
		cart.addToCartItem("1");
		cart.clickOnAddtoCartButton();
		shipping_cart= cart.clickOnShippingCartLink();
		shipping_cart= new ShippingCartPage();
		shipping= new ShippingPage();
		shipping=shipping_cart.clickOnProceedToCheckOut();
		payment=shipping.VerifyShippinfDetails(Street_Address,City,state, zip,phone_no);
		order_confirm= new OrderConfirmationPage();
		order_confirm=payment.clickonPlaceOrder();
	String Actual_msg=order_confirm.OrderConfirmationMsg();
	String Expected_msg="Thank you for your purchase!";

	Assert.assertEquals(Actual_msg, Expected_msg,"Text not matched");
		
	}
	
	@AfterMethod
	
	public void TearDown() {
		
		driver.quit();
	}

}
