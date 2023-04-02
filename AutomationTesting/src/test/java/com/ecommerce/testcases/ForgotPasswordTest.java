package com.ecommerce.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecommerce.base.Base;
import com.ecommerce.pages.ForgotPassword;
import com.ecommerce.pages.IndexPage;
import com.ecommerce.pages.Login;

public class ForgotPasswordTest extends Base{
	
	IndexPage index;
	Login login;
	ForgotPassword forgot;

	public ForgotPasswordTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    @BeforeMethod
	public void StartUp(){
		
		intialisation();
		index= new IndexPage();
		login= new Login();
		login=index.clickOnSignin();
	   forgot= login.VerifyForgotPassword();
		
	}
	@AfterMethod
    public void TearDown() {
    	
    	driver.quit();
    }
	
   @Test(priority=1)
	public void ValidateTitleTest() {
		
		String Actual_Title=forgot.getTitleOfPage();
		String Expected_Title="Forgot Your Password? Magento Commerce "
				+ "- website to practice selenium"
				+ " | demo website for automation testing "
				+ "| selenium practice sites";
		
		Assert.assertEquals(Actual_Title, Expected_Title,"Ttile not matched");
		
	}
   @Test(priority=2)
   public void RestpasswordTest() {
	   
	   forgot.CheckRestPassword();
   }
	
}
