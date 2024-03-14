package com.ecommerce.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.ecommerce.base.Base;
import com.ecommerce.pages.AddToCartPage;
import com.ecommerce.pages.CreateAccount;
import com.ecommerce.pages.IndexPage;
import com.ecommerce.pages.Login;
import com.ecommerce.pages.SearchResultPage;
import com.ecommerce.pages.YogaCollection;

public class IndexPageTest extends Base {

	IndexPage index;
	Login login;
	CreateAccount account;
	SearchResultPage search;
	YogaCollection yoga;
   AddToCartPage cart;
   
	public IndexPageTest() {

		super();

	}

	@BeforeMethod
	public void setUp() {

		intialisation();
		index = new IndexPage();
		cart= new AddToCartPage();
		yoga= new YogaCollection();
	}

	@Test(priority = 1)
	public void validateTitleTest() {

		String Title = index.validateTitlePage();

		String Expected_title = "Home Page";

		Assert.assertEquals(Title, Expected_title);

	}

	@Test(priority = 2)
	public void clickonSignlinkTest() {

		login = index.clickOnSignin();

	}

	@Test(priority = 3)
	public void clickonCreateAccountTest() {

		account = index.clickonCreateAccount();
	}

	@Test(priority = 4)
	public void verifylogoimageTest() {

		boolean flag = index.isLogoDisplayed();

		Assert.assertTrue(flag, "logo is not display");
	}

	@Test(priority = 5)
	
	public void clickOnBannerImageTest() {
		
		yoga=index.clickOnBannerImage();
	}
	@Test(priority = 6)
	  public void verifySearchProductTest() {
	  
	  search = index.searchProduct("Hero Hoodie"); }
	 

	@Test(priority = 7)

	public void verifyclickonyogabutntest() {

		yoga = index.clickOnshopNewyogabtn();
	}
	
	@Test(priority = 8)
	public void clickonEachProducttest() {
		
		index.clickonEachProduct();
	}
	
	
	@AfterMethod
	public void tearDown() {

		driver.quit();

	}

}
