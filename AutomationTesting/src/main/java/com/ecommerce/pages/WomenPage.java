package com.ecommerce.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ecommerce.action.ActionClass;
import com.ecommerce.base.Base;

public class WomenPage extends Base {
	
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	
	@FindBy(xpath = "//span[normalize-space()='Women']")
	WebElement womenmenu;

	@FindBy(xpath = "(//span[contains(text(),'Bottoms')])[1]")
	WebElement bottoms;

	@FindBy(xpath = "(//span[contains(text(),'Pants')])[1]")
	WebElement jackets;

	@FindBy(xpath = "//img[@alt='Portia Capri']")
	WebElement pant;
	
	@FindBy(xpath="(//a[@id='ui-id-9'])[1]")
	WebElement tops;

	@FindBy(xpath="(//a[@id='ui-id-11'])[1]")
	WebElement jacks;
	
	@FindBy(xpath="//img[@alt='Olivia 1/4 Zip Light Jacket']")
	WebElement jacket_prod;
	
	@FindBy(xpath="(//span[contains(text(),'Add to Cart')])[1]")
	WebElement cart_btn;
	
	public WomenPage() {

		PageFactory.initElements(driver, this);

	}

	public AddToCartPage verifyProduct()  {



		ActionClass.movetoElemet(womenmenu);
		
		ActionClass.movetoElemet(bottoms);
		
		
		ActionClass.clickAction(jackets);
		
	
		/*
		 * act.moveToElement(womenmenu).build().perform(); //Thread.sleep(3000);
		 * act.moveToElement(bottoms).build().perform(); //Thread.sleep(2000);
		 * act.moveToElement(jackets).build().perform(); //Thread.sleep(2000);
		 */		//jackets.click();

			ActionClass.movetoElemet(pant);
			 pant.click();

		return new AddToCartPage();
	}
	
	
	public AddToCartPage VerifyHoodieProducts()  {
		
		ActionClass.movetoElemet(womenmenu);
	
		ActionClass.movetoElemet(tops);
	
		ActionClass.clickAction(jacks);

		ActionClass.clickAction(jacket_prod);
		
	
		return new AddToCartPage();
	}
	

}
