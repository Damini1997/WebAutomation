package com.ecommerce.testcases;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ecommerce.base.Base;
import com.ecommerce.pages.CreateAccount;
import com.ecommerce.pages.IndexPage;
import com.ecommerce.utility.TestUtil;

public class CreateAccountPageTest extends Base {
	IndexPage index;
	CreateAccount account;
	
	String SheetName="CreateAccount";

	public CreateAccountPageTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setUp() {

		intialisation();
		index=new IndexPage();
		account= new CreateAccount();
		account = index.clickonCreateAccount();

	}
	
	@DataProvider
	public Object[][] getTestData() throws InvalidFormatException {
		
		Object data[][]=TestUtil.getTestData(SheetName);
		return data;
	}
	
	@Test(priority=1)
	public void VerifyTitleTest() {
		
		String Actual_Title=account.getTitleofPage();
		String Expected_Title="Create New Customer Account Magento Commerce "
				+ "- website to practice selenium | "
				+ "demo website for automation testing | selenium practice sites";
		
		Assert.assertEquals(Actual_Title, Expected_Title, "title not matched");
	}
	
	
	
	@Test(dataProvider="getTestData",priority=2)
	public void validateCreateAccountTest(String firstname, String last_name, String emailid,
			String password, String confirmpassword) {

		account.CreateNewAccount(firstname, last_name, emailid, password, confirmpassword);
	}

	@AfterMethod
	public void TearDown() {

		driver.quit();
	}

}
