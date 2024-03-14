package com.ecommerce.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecommerce.base.Base;
import com.ecommerce.pages.ForgotPassword;
import com.ecommerce.pages.Home;
import com.ecommerce.pages.IndexPage;
import com.ecommerce.pages.Login;
import com.ecommerce.utility.Log;

public class LoginPageTest extends Base {
	
	IndexPage index;
	Login login;
	ForgotPassword forgot_pass;
	Home home;
	
	
	public LoginPageTest(){
		
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		
		intialisation();
		index=new IndexPage();
		login= new Login();
		
		login=index.clickOnSignin();
		
	}
	
	@Test(priority=1)
	public void validateTitleTest() {
		
		Log.startTestCase("validateTitleTest");
		
		Log.info("user goigng to validate title of page");
		
		String Actual_Title =login.validateTitle();
		
		String Expected_Title="Customer Login";
		
		Assert.assertEquals(Actual_Title, Expected_Title);
		
		Log.info("page title is validated sucessfully");
		
		Log.endTestCase("validateTitleTest");
	}
	
	@Test(priority=2)
	public void validatefogrotpasswordlink() {
		
		forgot_pass=login.VerifyForgotPassword();
	}
	
	@Test(priority=3)
	public void LoginTest() {
		
		home=login.verifyLogin(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test
	public void VerifyErrorMessageTest() {
		
		
	}
	
	

	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}
