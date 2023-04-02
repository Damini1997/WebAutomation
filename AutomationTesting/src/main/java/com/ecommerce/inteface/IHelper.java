package com.ecommerce.inteface;

import org.openqa.selenium.WebElement;

public interface IHelper {
	
	public void clickOnElement(WebElement element);
	
	public void enterInTextbox(WebElement element,String Text);
	
	public void enterintoTextBoxwithClear(WebElement element,String Text);
	
	public void moveToElement(WebElement element);
	
	public void MoveToElemetClick(WebElement element);
	
	public boolean elementIsDisplayed(WebElement element);
	
	public boolean elementIsEnabled(WebElement element);

	public String GetTextfromElement(WebElement element);
     
	public void scrollintoView(WebElement element);
	
	public void JavaScriptClick(WebElement element);
	
	//public void MouseMoveOver(WebElement element);
	
	public void scrolltoDown();
	

}
