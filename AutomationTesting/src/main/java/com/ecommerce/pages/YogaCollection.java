package com.ecommerce.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ecommerce.action.ActionClass;
import com.ecommerce.base.Base;

public class YogaCollection extends Base{
	
	ActionClass act = new ActionClass();
	
	public AddToCartPage addSpecificProduct() {

		List<WebElement> yoga_products = driver.findElements(By.cssSelector("a.product-item-link"));

		for (int i = 0; i < yoga_products.size(); i++) {

			String name = yoga_products.get(i).getText();

			if (name.contains("Nora Practice Tank")) {

			driver.findElements(By.xpath("(//span[contains(text(),'Add to Cart')])")).get(i).getText();
						
				break;
			}
		}

		return new AddToCartPage();

	}
	


	

}
