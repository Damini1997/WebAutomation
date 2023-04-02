package com.ecommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.base.Base;

public class MyAccountPage extends Base {
	
	@FindBy(id="firstname")
	WebElement name;
	
	@FindBy(id="lastname")
	WebElement lastname;
	
	@FindBy(id="change-email")
	WebElement change_email;
	

	@FindBy(id="change-password")
	WebElement change_password;
	
	@FindBy(xpath="//span[normalize-space()='Save']")
	WebElement save_button;
	
	@FindBy(id="current-password")
	WebElement current_password;
	
	@FindBy(id="password")
	WebElement new_password;
	
	@FindBy(id="password-confirmation")
	WebElement confirm_password;
	
	@FindBy(xpath="//a[normalize-space()='Change Password']")
	WebElement Change_password;
	
	@FindBy(xpath="//span[normalize-space()='Manage Addresses']")
	WebElement manage_address;
	
	@FindBy(xpath="(//span[contains(text(),'View All')])[1]")
	WebElement orderlink;
	
	@FindBy(xpath="(//strong[contains(text(),'My Wish List')])[1]")
	WebElement MyWishListLink;
	
	public MyAccountPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void ChangeDetails() {
		
		Change_password.click();
		name.clear();
		name.sendKeys("Dipti");
		lastname.clear();
		lastname.sendKeys("Sharma");
		save_button.click();
	
	}
	
	
	public Addressbook clickOnManageAddress() {
		
		manage_address.click();
		return new Addressbook();
	}
	
	public Orders clickOnRecentOrder() {
		
		orderlink.click();
		return new Orders();
	}
	
	public WiShList ClickOnWishListLink() {
		
		MyWishListLink.click();
		return new WiShList();
	}

}
