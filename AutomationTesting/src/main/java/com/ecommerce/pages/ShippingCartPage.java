package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ecommerce.base.Base;

public class ShippingCartPage extends Base {

	@FindBy(id = "cart-221170-qty")
	WebElement qty_box;

	@FindBy(xpath = "(//a[@title='Edit item parameters'])[1]")
	WebElement edit_button;

	@FindBy(xpath = "((//a[@title='Remove item'])[3]")
	WebElement delete_button;

	@FindBy(xpath = "//span[text()='Update Shopping Cart']")
	WebElement update_shopping_cart_button;

	@FindBy(xpath = "//span[text()='Proceed to Checkout']")
	WebElement proceed_checkout_button;

	public ShippingCartPage() {

		PageFactory.initElements(driver, this);

	}

	public String getTitleOfPage() {

		return driver.getTitle();
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
