package com.ecommerce.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ecommerce.action.ActionClass;
import com.ecommerce.helper.Helper;
import com.ecommerce.pageLocators.IndexPageLocators;

public class IndexPage extends IndexPageLocators {

	Helper helper = new Helper();

	ActionClass act = new ActionClass();

	// we use constructor to initialise all pagefactory web elements
	public IndexPage() {

		super();
	}

	public String validateTitlePage() {

		return driver.getTitle();
	}

	public Login clickOnSignin() {

		helper.clickOnElement(sign_btn);
		return new Login();
	}

	public CreateAccount clickonCreateAccount() {

		helper.clickOnElement(create_account);
		// create_account.click();
		return new CreateAccount();

	}

	public boolean isLogoDisplayed() {

		return helper.elementIsDisplayed(logo_img);

	}

	public SearchResultPage searchProduct(String prod_name) {

		//helper.enterintoTextBoxwithClear(searchbox, prod_name);
		
		helper.enterInTextbox(searchbox, prod_name);

		WebElement dropdown = driver.findElement(By.xpath("(//li[@id='qs-option-0'])[1]"));

		helper.MoveToElemetClick(dropdown);

		return new SearchResultPage();
	}

	public YogaCollection clickOnshopNewyogabtn() {

		helper.clickOnElement(yogabtn);
		return new YogaCollection();

	}

	public WhatsNewPage clickOnWhatsNew() {

		helper.clickOnElement(Whats_New);
		return new WhatsNewPage();

	}

	public YogaCollection clickOnBannerImage() {

		WebElement bannerimg = driver.findElement(By.cssSelector("a.block-promo.home-main"));
		bannerimg.findElement(By.xpath("//span[@class='action more button']")).click();
		return new YogaCollection();
	}
	
	public void clickonEachProduct() {
		
		helper.scrollintoView(hotsellers);
		
		List<WebElement> products=driver.findElements(By.xpath("//li[@class='product-item']"));
		
		for(int i= 0; i<products.size();i++) {
			
			WebElement product=	products.get(i);
			
			helper.MoveToElemetClick(product);
			
			driver.navigate().back();
			
		 products=driver.findElements(By.xpath("//li[@class='product-item']"));

		}
	}

}
