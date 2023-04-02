
package com.ecommerce.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ecommerce.action.ActionClass;
import com.ecommerce.base.Base;
import com.ecommerce.helper.Helper;
import com.ecommerce.pageLocators.HomePageLocators;

public class Home extends HomePageLocators {

	Helper helper = new Helper();

	ActionClass act = new ActionClass();

	public Home() {

		PageFactory.initElements(driver, this);

	}

	public boolean isNameDispalyed() {

		// wait.until(ExpectedConditions.visibilityOf(welcome_profile));
		return helper.elementIsDisplayed(welcome_profile);

	}

	public String VerifyNameofAccountHolder() {

		return helper.GetTextfromElement(welcome_profile);

	}

	public String getTitle() {

		return driver.getTitle();

	}

	public YogaCollection ClickonshopNewYoga() {

		helper.clickOnElement(shopnewyogabtn);
		return new YogaCollection();

	}

	public WomenPage clickonwomenPageLink() {

		helper.clickOnElement(women);
		return new WomenPage();

	}

	public WiShList addToWishList() {
		helper.clickOnElement(dropdown);
		helper.clickOnElement(wishlist);
		return new WiShList();
	}

	public MyAccountPage clickOnAccount() {

		helper.clickOnElement(dropdown);
		helper.clickOnElement(myaccount);
		return new MyAccountPage();

	}

	public Gear clickOnGearPage() {

		helper.moveToElement(gear);
		helper.MoveToElemetClick(bags);

		return new Gear();

	}

	public void CartIconClick() {

		cart_icon.click();

	}

}
