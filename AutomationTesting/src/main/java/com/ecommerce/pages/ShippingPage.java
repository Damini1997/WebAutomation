package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.ecommerce.action.ActionClass;
import com.ecommerce.base.Base;

public class ShippingPage extends Base {

	@FindBy(name = "firstname")
	WebElement name;

	@FindBy(name = "lastname")
	WebElement lastname;

	@FindBy(name = "street[0]")
	WebElement street1;

	@FindBy(name = "city")
	WebElement city;

	@FindBy(name = "region_id")
	WebElement state;

	@FindBy(name = "postcode")
	WebElement postal_code;

	@FindBy(name = "country_id")
	WebElement country_name;

	@FindBy(name = "telephone")
	WebElement phone_no;

	// @FindBy(id="ko_unique_1")
	// WebElement radio_b;

	@FindBy(xpath = "(//span[normalize-space()='Next'])[1]")
	WebElement next_btn;

	@FindBy(xpath = "//span[normalize-space()='New Address']")
	WebElement new_address;

	@FindBy(xpath = "//span[normalize-space()='Ship here']")
	WebElement shiphere;

	@FindBy(xpath = "//div[@class='shipping-address-item selected-item']")
	WebElement selected_address;
	
	@FindBy(xpath="(//span[text()='Sign In'])[1]")
	WebElement SigninLink;

	@FindBy(id="login-email")
	WebElement email;
	
	@FindBy(id="login-password")
	WebElement password;
	
	@FindBy(xpath="(//span[contains(text(),'Sign In')])[2]")
	WebElement signIn;
	public ShippingPage() {

		PageFactory.initElements(driver, this);

	}

	public ReviewPayment VerifyShippinfDetails(String streetAddress, String city_s, String state_s, String code,
			String mobile) throws InterruptedException {

		//Thread.sleep(40000);
		
	ActionClass.ExplicitWait().
	until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[normalize-space()='New Address']")));	

		WebElement element = driver.findElement(By.xpath("//span[normalize-space()='New Address']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
		
		//new_address.click();
		name.isDisplayed();
		lastname.isDisplayed();

		street1.sendKeys(streetAddress);
		city.sendKeys(city_s);
		Select select = new Select(state);
		select.selectByVisibleText(state_s);
		postal_code.sendKeys(code);
		phone_no.sendKeys(mobile);
		shiphere.click();
		// radio_b.click();
		Thread.sleep(10000);

		next_btn.click();

		

		return new ReviewPayment();

	}
	
	
	/*
	 * public ReviewPayment clickonSignin() throws InterruptedException {
	 * 
	 * SigninLink.click(); email.sendKeys(prop.getProperty("username"));
	 * password.sendKeys(prop.getProperty("password")); signIn.click();
	 * Thread.sleep(20000); return new ReviewPayment(); }
	 */
}
