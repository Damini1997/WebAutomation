package com.ecommerce.pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.base.Base;

public class LoginPageLocators extends Base {
	
	public LoginPageLocators() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="login[username]")
	protected WebElement emailid;
	
	@FindBy(name="login[password]")
	protected WebElement password;
	
	@FindBy(id="send2")
	protected WebElement login_btn;
	
	@FindBy(linkText="Forgot Your Password?")
	protected WebElement forgotpassword;
	
	@FindBy(xpath="//div[@class='footer content']")
	protected WebElement Footer;
	
	@FindBy(xpath="(//div[@id='email-error'])[1]")
	protected WebElement error_msg;

}
