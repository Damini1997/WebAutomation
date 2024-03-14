package com.ecommerce.pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.base.Base;

public class AddToCartPageLocators  extends Base {
	
	public AddToCartPageLocators() {
		
    	PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="(//div[@id='option-label-size-143-item-166'])[1]")
	protected WebElement sizeBox;
	
	
	@FindBy(xpath="(//div[@id='option-label-color-93-item-52'])[1]")
	protected WebElement selectcolur;
	
	@FindBy(css="#qty")
	protected WebElement qty_box;

	@FindBy(xpath="//button[@id='product-addtocart-button']")
	protected WebElement addtocartbtn;
}
