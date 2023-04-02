package com.ecommerce.helper;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ecommerce.base.Base;
import com.ecommerce.inteface.IHelper;

public class Helper extends Base implements IHelper {
	
	
	Actions action = new Actions(driver);
	   public static WebDriverWait wait;
	    static int time = 30;
	    JavascriptExecutor js;
	
	public static void elementToBeClickaleWait(WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * 
	 * @param element
	 */
	public static void elementToBeVisibleWait(WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	
	public static void ElementtoBeVisibleText(WebElement element,String text) {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.textToBePresentInElement(element, text));
	}
	
	
	

	public void clickOnElement(WebElement element) {
		elementToBeClickaleWait(element);
		element.click();
		
	}

	@Override
	public void enterInTextbox(WebElement element, String Text) {
		elementToBeVisibleWait(element);
		element.sendKeys(Text);
		
	}

	@Override
	public void moveToElement(WebElement element) {
		elementToBeVisibleWait(element);
		action.moveToElement(element).build().perform();
		
	}

	@Override
	public void MoveToElemetClick(WebElement element) {
		elementToBeVisibleWait(element);
		action.moveToElement(element).click().build().perform();
	}

	@Override
	public boolean elementIsDisplayed(WebElement element) {
		elementToBeVisibleWait(element);
		return element.isDisplayed();
	}

	@Override
	public boolean elementIsEnabled(WebElement element) {
		elementToBeVisibleWait(element);
		return element.isEnabled();
	}

	@Override
	public String GetTextfromElement(WebElement element) {
		elementToBeVisibleWait(element);
		return element.getText();
	}

	@Override
	public void enterintoTextBoxwithClear(WebElement element, String Text) {
		elementToBeVisibleWait(element); 
        element.clear();
        element.sendKeys(Text);
		  
		
	}

	@Override
	public void scrollintoView(WebElement element) {
		js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	@Override
	public void JavaScriptClick(WebElement element) {
		js= (JavascriptExecutor)driver;
		js.executeScript("argumetns[0].click()", element);
	}

	@Override
	public void scrolltoDown() {
		
		 js= (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,600)");
		
	}

}
