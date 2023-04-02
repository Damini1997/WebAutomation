package com.ecommerce.pages;

import com.ecommerce.helper.Helper;
import com.ecommerce.pageLocators.LoginPageLocators;

public class Login extends LoginPageLocators {
	
	Helper helper = new Helper();

	public String validateTitle() {

		return driver.getTitle();

	}

	public ForgotPassword VerifyForgotPassword() {

		forgotpassword.click();
		return new ForgotPassword();

	}

	public Home verifyLogin(String unsername, String pass) {

		emailid.sendKeys(unsername);
		password.sendKeys(pass);
		login_btn.click();
		return new Home();

	}
	
	public String VerifyMandatoryfieldmsg() {
		
		helper.clickOnElement(login_btn);
		return helper.GetTextfromElement(error_msg);
		
	}

}
