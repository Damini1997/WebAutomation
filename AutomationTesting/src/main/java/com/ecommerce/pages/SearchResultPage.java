package com.ecommerce.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.pageLocators.SearchPageLocators;

public class SearchResultPage extends SearchPageLocators {
	
	 public SearchResultPage() {
		 
		 PageFactory.initElements(driver, this);
	 }
	 
	 
	 public String getTitleofPage() {
		 
		return driver.getTitle();
	 }
	 
	 public int getcountofSearchresultTest() {
		 
	List<WebElement> product_items= driver.findElements(By.xpath("//li[@class='item product product-item']"));
	
	  int count_product =product_items.size();
	
	   return count_product;
	 }
	 
	 public void 
}
