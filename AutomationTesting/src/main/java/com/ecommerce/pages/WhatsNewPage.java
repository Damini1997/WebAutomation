package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.base.Base;

public class WhatsNewPage extends Base {
	
	public WhatsNewPage() {

		PageFactory.initElements(driver, this);
	}
	
	
	public String ValidateTitle() {
		
		return driver.getTitle();
	}
	
	
	public void clickOneachlink() {
		
		
		
		for(int i=1;i<=6;i++) {
		
				WebElement links=driver.findElement(By.xpath("(//li[@class='item'])["+i+"]"));
				
				links.click();
				
				String Title=driver.getTitle();
				
				String URL=driver.getCurrentUrl();
				
				System.out.println("The Title of Page is :"+Title +"The Current URL is :"+URL);
				
				driver.navigate().back();
	}

	}
	

}
