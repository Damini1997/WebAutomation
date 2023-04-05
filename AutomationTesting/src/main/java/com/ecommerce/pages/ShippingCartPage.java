package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ecommerce.base.Base;
import com.ecommerce.helper.Helper;
import com.ecommerce.pageLocators.ShippingCartPageLocators;

public class ShippingCartPage extends ShippingCartPageLocators {
	
	Helper helper = new Helper();


	public String getTitleOfPage() {

		return driver.getTitle();
	}
	
	public String getPriceofElement() {
		
		return helper.GetTextfromElement(price);
		
	}
	
	public String getValuefromQtyBox() {
		
		return qty.getCssValue("value");
	}
	
	public String getValueOfSubTotal() {
		
		return helper.GetTextfromElement(subTotal);
		
	}

	public void UpdateCartItems(String cart) {

		qty_box.clear();
		qty_box.sendKeys(cart);
		update_shopping_cart_button.click();

	}

	public ShippingPage clickOnProceedToCheckOut() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Proceed to Checkout']"))).click();
		
		//proceed_checkout_button.click();
		
		return new ShippingPage();
	}
	
	

}
