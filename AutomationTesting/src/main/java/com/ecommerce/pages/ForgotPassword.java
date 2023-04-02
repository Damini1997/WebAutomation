package com.ecommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.base.Base;

public class ForgotPassword extends Base{
	
	@FindBy(id="email_address")
	WebElement emailid;
	
	@FindBy(xpath="//*[contains(text(),'Reset My Password')]")
	WebElement rest_btn;
	

	public ForgotPassword(){
		
		
		PageFactory.initElements(driver, this);
	}
	
	public String getTitleOfPage() {
		
		return driver.getTitle();
		
	}
	
	public void CheckRestPassword() {
		
		emailid.sendKeys(prop.getProperty("username"));
		rest_btn.click();
		
		
	}
	
	
	

}
