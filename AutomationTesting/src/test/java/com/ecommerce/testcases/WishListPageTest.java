package com.ecommerce.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecommerce.base.Base;
import com.ecommerce.pages.AddToCartPage;
import com.ecommerce.pages.Home;
import com.ecommerce.pages.IndexPage;
import com.ecommerce.pages.Login;
import com.ecommerce.pages.MyAccountPage;
import com.ecommerce.pages.WiShList;

public class WishListPageTest extends Base {
	IndexPage index;
	Login login;
	Home home;
	MyAccountPage account_details;
	WiShList wishlist;
	AddToCartPage cart;
	
	public WishListPageTest() {
		
		super();
		
	}
	
	@BeforeMethod
	public void StartUp()  {
		
		intialisation();
		index=new IndexPage();
		login= new Login();
		login=index.clickOnSignin();
		home=login.verifyLogin(prop.getProperty("username"), prop.getProperty("password"));
		account_details= new MyAccountPage();
		account_details=home.clickOnAccount();
		wishlist = new WiShList();
		wishlist=account_details.ClickOnWishListLink();
		cart = new AddToCartPage();	
	}
	
	@Test(priority=1)
	public void addWishlistProductToCartTest() {
		
		cart=wishlist.addtoCart();
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	

}
