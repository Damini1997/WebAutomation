package com.ecommerce.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.helper.Helper;
import com.ecommerce.pageLocators.AddToCartPageLocators;

public class AddToCartPage extends AddToCartPageLocators {

	JavascriptExecutor js = (JavascriptExecutor) driver;

	Helper helper = new Helper();

	public AddToCartPage() {

		PageFactory.initElements(driver, this);
	}
	
	

	public void selectSize() {
		
		List<WebElement> listBox=driver.findElements
				(By.cssSelector("div[class='swatch-attribute size'] div[role='listbox']"));
		
		 for(int i=0;i<listBox.size();i++) {
			 
			String Text= listBox.get(i).getText();
			
			if(Text.contains("XS")) {
				
				sizeBox.click();
				
			}
		 }
         
		//helper.clickOnElement(sizebox);
		//sizebox.click();

	}

	public void selectColour() {

		helper.clickOnElement(selectcolur);
		//selectcolur.click();

	}

	public void addToCartItem(String size) {

		helper.enterintoTextBoxwithClear(qty_box, size);
		//qty_box.clear();
		//qty_box.sendKeys(size);

	}

	public void clickOnAddtoCartButton() {

		helper.clickOnElement(addtocartbtn);
		//wait.until(ExpectedConditions.visibilityOf(addtocartbutton)).click();
		
		js.executeScript("window.scrollBy(0,-250)");
	}

	public ShippingCartPage clickOnShippingCartLink() {

		//shoppingcartlink.click();
		
		helper.clickOnElement(shoppingcartlink);

		// JavascriptExecutor executor = (JavascriptExecutor)driver;
		// executor.executeScript("arguments[0].click();", element);

		// checkoutbutton.click();
		return new ShippingCartPage();

	}

	
	
	
	
}
