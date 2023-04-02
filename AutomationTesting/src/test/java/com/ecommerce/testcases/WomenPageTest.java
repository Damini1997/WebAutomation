package com.ecommerce.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecommerce.base.Base;
import com.ecommerce.pages.AddToCartPage;
import com.ecommerce.pages.Home;
import com.ecommerce.pages.IndexPage;
import com.ecommerce.pages.Login;
import com.ecommerce.pages.WomenPage;

public class WomenPageTest extends Base {
	
	IndexPage index;
	Login login;
	Home home;
	WomenPage women;
	AddToCartPage cart;
	
	public WomenPageTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setUp() {
		
		intialisation();
		index=new IndexPage();
		login= new Login();
		login=index.clickOnSignin();
		home=login.verifyLogin(prop.getProperty("username"), prop.getProperty("password"));
		women= new WomenPage();
		
		
	}
	
	
	@Test(priority=1)
	public void verifyProductTest() throws InterruptedException {
		
		cart=women.verifyProduct();
		
	}
	
	
	  @Test(priority=2) public void VerifyHoodieProductsTest() 
     {
	  
	  cart=women.VerifyHoodieProducts();
	  
	  }
	 
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	
}
