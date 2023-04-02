package com.ecommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.base.Base;

public class OrderConfirmationPage extends Base {
	
	@FindBy(xpath="//span[@class='base']")
	WebElement confirmationText;
	

    public OrderConfirmationPage() {
		
	PageFactory.initElements(driver, this);
	
	} 
	
    public String OrderConfirmationMsg() {
    	
    	String ConfirmationMsg=confirmationText.getText();
    	return ConfirmationMsg;
    	
    	
    }
	

}
