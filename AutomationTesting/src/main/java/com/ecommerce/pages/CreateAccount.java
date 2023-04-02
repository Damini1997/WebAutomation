package com.ecommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.base.Base;

public class CreateAccount extends Base {
	
	@FindBy(id="firstname")
	WebElement FirstName;
	
	@FindBy(id="lastname")
	WebElement LastName;
	
	@FindBy(id="email_address")
	WebElement EmailAddress;
	
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="password-confirmation")
	WebElement Confirm_Password;
	
	@FindBy(xpath="//button[@title='Create an Account']//span[contains(text(),'Create an Account')]")
    WebElement CreateAccount; 	
	
	public CreateAccount(){
		
		
		PageFactory.initElements(driver, this);
	}
	
	
	public String getTitleofPage() {
		
		return driver.getTitle();
	
	}
	
	public String getTitleTest() {
		
		return driver.getTitle();
	}	
	
	public void CreateNewAccount(String f_name,String l_name,String email_id,String Pass,String c_password) {
		
		FirstName.sendKeys(f_name);
		LastName.sendKeys(l_name);
		EmailAddress.sendKeys(email_id);
		Password.sendKeys(Pass);
		Confirm_Password.sendKeys(c_password);
		CreateAccount.click();
		
	}

	
	
	
	

}

