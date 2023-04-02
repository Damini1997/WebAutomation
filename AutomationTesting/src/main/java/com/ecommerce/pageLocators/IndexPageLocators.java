package com.ecommerce.pageLocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.base.Base;

public class IndexPageLocators extends Base {

	public IndexPageLocators() {
		
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(linkText = "Sign In")
	public WebElement sign_btn;

	@FindBy(linkText = "Create an Account")
	public WebElement create_account;

	@FindBy(xpath = "//a[@class='logo']")
	public WebElement logo_img;

	@FindBy(id = "search")
	public WebElement searchbox;

	public List<WebElement> dropdown;

	@FindBy(xpath = "(//span[text()='My Cart'])[1]")
	public WebElement cart;

	@FindBy(xpath = "//*[text()='Shop New Yoga']")
	public WebElement yogabtn;

	
	@FindBy(xpath="(//span[normalize-space()=\"What's New\"])[1]")
	public WebElement Whats_New;
	
	
	

}
