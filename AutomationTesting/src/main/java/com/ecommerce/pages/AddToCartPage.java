package com.ecommerce.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ecommerce.base.Base;

public class AddToCartPage extends Base {

	JavascriptExecutor js = (JavascriptExecutor) driver;

	@FindBy(xpath = "(//div[@class='swatch-option text'])[1]")
	WebElement sizebox;

	@FindBy(xpath = "(//div[@class='swatch-option color'])[1]")
	WebElement selectcolur;

	@FindBy(id = "qty")
	WebElement qty_box;

	@FindBy(xpath = "//span[normalize-space()='Add to Cart']")
	WebElement addtocartbtn;

	@FindBy(css = "a.action.showcart")
	WebElement carticon;

	@FindBy(xpath = "//span[text()='Add to Cart']")
	WebElement addtocartbutton;

	@FindBy(xpath = "//button[@id='top-cart-btn-checkout']")
	WebElement proceedToCheckoutbtn;

	@FindBy(linkText = "shopping cart")
	WebElement shoppingcartlink;

	public AddToCartPage() {

		PageFactory.initElements(driver, this);
	}

	public void selectSize() {

		sizebox.click();

	}

	public void selectColour() {

		selectcolur.click();

	}

	public void addToCartItem(String size) {

		qty_box.clear();
		qty_box.sendKeys(size);

	}

	public void clickOnAddtoCartButton() {

		wait.until(ExpectedConditions.visibilityOf(addtocartbutton)).click();
		js.executeScript("window.scrollBy(0,-250)");
	}

	public ShippingCartPage clickOnShippingCartLink() {

		shoppingcartlink.click();

		// JavascriptExecutor executor = (JavascriptExecutor)driver;
		// executor.executeScript("arguments[0].click();", element);

		// checkoutbutton.click();
		return new ShippingCartPage();

	}

	
	
	
	
}
