package com.ecommerce.pageLocators;

import org.openqa.selenium.support.PageFactory;

import com.ecommerce.base.Base;

public class SearchPageLocators  extends Base {

	  public SearchPageLocators() {
	    	
	    	PageFactory.initElements(driver, this);
	    }
}
