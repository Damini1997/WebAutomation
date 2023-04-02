package com.ecommerce.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.base.Base;

public class ReviewPayment extends Base {
	
	
	@FindBy(xpath="//span[text()='Place Order']")
	WebElement placeorderbtn;
	
	
	
    public ReviewPayment() {
		
	PageFactory.initElements(driver, this);
	
	} 
	
    public OrderConfirmationPage clickonPlaceOrder() throws InterruptedException  {
    	
    	Thread.sleep(10000);
    	
    	placeorderbtn.click();
    	
    	Thread.sleep(20000);
    	
		/*
		 * WebElement element =
		 * driver.findElement(By.xpath("//span[text()='Place Order']"));
		 * JavascriptExecutor executor = (JavascriptExecutor)driver;
		 * executor.executeScript("arguments[0].click();", element);
		 */
	
    //
//    
	
    	return new OrderConfirmationPage();
} 

}
