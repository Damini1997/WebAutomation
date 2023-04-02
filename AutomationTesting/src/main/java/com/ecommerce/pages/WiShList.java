package com.ecommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.action.ActionClass;
import com.ecommerce.base.Base;

public class WiShList extends Base {

	@FindBy(xpath="//div[@data-container='product-grid']//img[@alt='Mimi All-Purpose Short']")
	WebElement product_image;
	
	@FindBy(xpath= "(//input[@id='qty[6448]'])[1]")
	WebElement qty;
	
	@FindBy(xpath="(//span[contains(text(),'Add to Cart')])[1]")
	WebElement addtocartButton;
	
	public WiShList() {
		
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	public AddToCartPage addtoCart() {
		
		ActionClass.movetoElemet(product_image);
		qty.clear();
		qty.sendKeys("2");
		addtocartButton.click();
		
		return new AddToCartPage();
		
	}
	
	
	
}
