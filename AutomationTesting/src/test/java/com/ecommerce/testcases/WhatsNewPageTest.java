package com.ecommerce.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecommerce.base.Base;
import com.ecommerce.pages.IndexPage;
import com.ecommerce.pages.WhatsNewPage;

public class WhatsNewPageTest extends Base {
	
	IndexPage index;
    WhatsNewPage whatnew;
	public WhatsNewPageTest() {
		
		super();
	}
	
	@BeforeMethod
	public void setUp() {

		intialisation();
		index = new IndexPage();
		whatnew=index.clickOnWhatsNew();
	}
	
	
	@Test(priority=2,enabled=false)
	public void validateTitlePageTest() {
		
		String Title=driver.getTitle();
		String Expected_Title="What's New Magento Commerce -"
				+ " website to practice selenium | demo website for automation testing |"
				+ " selenium practice sites";
		
		Assert.assertEquals(Title, Expected_Title,"Title not matched");
		
	}
	
	@Test(priority=1)
	public void cliconeachlinkTest() {
		
		whatnew.clickOneachlink();
	}
	
	
	@AfterMethod
	public void tearDown() {

		driver.quit();

	}
	

}
