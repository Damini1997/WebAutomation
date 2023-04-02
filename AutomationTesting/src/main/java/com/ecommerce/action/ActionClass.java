package com.ecommerce.action;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ecommerce.base.Base;

public class ActionClass extends Base {

	public static void clickAction(WebElement element) {
		new Actions(driver).moveToElement(element).click().build().perform();
	}
	
	public static void movetoElemet(WebElement element) {
		new Actions(driver).moveToElement(element).build().perform();;
	}
	
	public static WebDriverWait ExplicitWait() {
		
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    
	    return wait;
      
	}
	

}
