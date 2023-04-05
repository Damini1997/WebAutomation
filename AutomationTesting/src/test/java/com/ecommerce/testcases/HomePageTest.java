package com.ecommerce.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecommerce.base.Base;
import com.ecommerce.pages.AddToCartPage;
import com.ecommerce.pages.Gear;
import com.ecommerce.pages.Home;
import com.ecommerce.pages.IndexPage;
import com.ecommerce.pages.Login;
import com.ecommerce.pages.Men;
import com.ecommerce.pages.MyAccountPage;
import com.ecommerce.pages.ShippingCartPage;
import com.ecommerce.pages.WiShList;
import com.ecommerce.pages.YogaCollection;

public class HomePageTest extends  Base {
	
	IndexPage index;
	Login login;
	Home home;
	Men men;
	YogaCollection yoga;
	AddToCartPage cart;
	WiShList wishlist;
	MyAccountPage account_details;
	Gear gear;
	ShippingCartPage shipping_cart;
	
	public HomePageTest() {
		
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		
		intialisation();
		index=new IndexPage();
		login= new Login();
		login=index.clickOnSignin();
		home=login.verifyLogin(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority=1,testName="Verify name test",enabled=false)
	public void isNameDisplayedTest() {
		
		boolean result=home.isNameDispalyed();
		
		
		
		Assert.assertTrue(result, "name is not displayed");
	}
	
	@Test(priority=2,testName="Validate Title Test",enabled=false)
	public void ValidatePageTitleTest() {
		
		String title=driver.getTitle();
		String Expected_Title="Home Page - Magento eCommerce - website to practice selenium "
				+ "| demo website for automation testing | selenium practice sites | selenium demo sites | "
				+ "best website to practice selenium automation"
				+ " | automation practice sites Magento Commerce - website to practice selenium |"
				+ " demo website for automation testing | selenium practice sites";
		
		Assert.assertEquals(title, Expected_Title);
	}
	
	
	@Test(priority=3,testName="yoga collection menu test",enabled=false)
	public void verifyyogacollectionTest() {
		
		yoga=home.ClickonshopNewYoga();
	}
	
	@Test(priority=4,testName="wishlist icon test",enabled=false)
	public void verifyWishListTest() {
		
		wishlist=home.addToWishList();
		
		
		
	}
	
	@Test(priority=5,testName="Account holder name test",enabled=false)
	public void VerifyAccountHolderNameTest() {
		
		String name=home.VerifyNameofAccountHolder();
		
		String Expected_name="Welcome, damini pophali!";
		
		Assert.assertEquals(name, Expected_name,"Name is not matched !");
	}
	
	@Test(priority=6,testName="Click on my account test",enabled=false)
	public void VerifyClickOnMyAccount() {
		
		account_details=home.clickOnAccount();
		
		String title=driver.getTitle();
		
		String Expected_title="My Account Magento Commerce - website to practice selenium"
				+ " | demo website for automation testing | selenium practice sites";
		
		Assert.assertEquals(title, Expected_title, "Title not matched");
		
	}
	
	
	@Test(priority=7,testName="Gear page test",enabled=false)
	public void clickOnGearPageTest() {
		
		gear=home.clickOnGearPage();
		
	}
	
	@Test(priority=8,testName="Click on cart icon test",enabled=false)
	 public void CartIconTest() {
		 
		 home.CartIconClick();
		 
	 }
	@Test(priority=9,testName="add specific product to cart test")
	public void clickOnCartbtnTest() throws InterruptedException {
		
		cart=home.clickOnAddToCartBtn();
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}
