package com.ecommerce.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecommerce.base.Base;
import com.ecommerce.pages.Addressbook;
import com.ecommerce.pages.Home;
import com.ecommerce.pages.IndexPage;
import com.ecommerce.pages.Login;
import com.ecommerce.pages.MyAccountPage;
import com.ecommerce.pages.Orders;

public class MyAccountPageTest  extends Base{
	
	IndexPage index;
	Login login;
    Home home;
    MyAccountPage account;
    Addressbook address;
    Orders order;
    
	public MyAccountPageTest() {
	
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		
		intialisation();
		index= new IndexPage();
		login = new Login();
		login=index.clickOnSignin();
		home=login.verifyLogin(prop.getProperty("username"), prop.getProperty("password"));
		account=home.clickOnAccount();
		
		
	}
	
	@Test(priority=1)
	public void UpdateAccountDetails() {
		
		account.ChangeDetails();
		
	}
	
	@Test(priority=2)
	public void clickOnManageAddressTest() {
		
		address=account.clickOnManageAddress();
	}
	
	@Test(priority=3)
	public void clickOnOrderTest() {
		
		order=account.clickOnRecentOrder();
	}
	
	
	
	@AfterMethod
	public void TearDown() {
		
		driver.quit();
	}
	
	
}
