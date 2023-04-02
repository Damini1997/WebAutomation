package com.ecommerce.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecommerce.base.Base;
import com.ecommerce.pages.AddToCartPage;
import com.ecommerce.pages.IndexPage;
import com.ecommerce.pages.ShippingPage;
import com.ecommerce.pages.YogaCollection;

public class YogaCollectionTest  extends Base {
	
	IndexPage index;
	YogaCollection yoga;
	AddToCartPage cart;
	ShippingPage shipping;
	

	public YogaCollectionTest() {
		super();
	
	}

	@BeforeMethod
	public void setUp() {
		
		intialisation();
		index= new IndexPage();
		
		
	}
	
	@Test
	public void addSpecificProductTest() throws InterruptedException {
		
		yoga=index.clickOnshopNewyogabtn();
		cart=yoga.addSpecificProduct();
	
	}
	
	@AfterMethod
	public void TearDown() {
		
		driver.quit();
	}
}
