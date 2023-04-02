package com.ecommerce.pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.base.Base;

public class HomePageLocators extends Base {
	
	    public HomePageLocators() {
	    	
	    	PageFactory.initElements(driver, this);
	    }
	
	
	
	@FindBy(xpath="(//span[@class='logged-in'])[1]")
	protected WebElement welcome_profile;
	
	
	@FindBy(xpath="//span[text()='Shop New Yoga']")
	protected WebElement shopnewyogabtn;
	
	@FindBy(xpath="//span[text()='Women']")
	protected WebElement women;
	
	@FindBy(xpath="//a[normalize-space()='Breathe-Easy Tank']")
	protected WebElement women_top;
	
	@FindBy(linkText="My Wish List")
	protected WebElement wishlist;
	
	@FindBy(xpath="//button[@class='action switch'][1]")
	protected WebElement dropdown;
	
	@FindBy(linkText="My Account")
	protected WebElement myaccount;
	
	@FindBy(xpath="//span[normalize-space()='Gear']")
	protected WebElement gear;
	
	@FindBy(xpath="(//a[@id='ui-id-25'])[1]")
	protected WebElement bags;
	
	@FindBy(xpath="(//a[@class='action showcart'])[1]")
	protected WebElement cart_icon;
	
	@FindBy(id="top-cart-btn-checkout")
	protected WebElement proceed_to_checkout_button;

}
