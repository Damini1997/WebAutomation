package com.ecommerce.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.DOMConfiguration;

import io.github.bonigarcia.wdm.WebDriverManager;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
public class Base {
	
	public static Properties prop;
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	 
	public Base()  {
		
		prop = new Properties();
		
		FileInputStream ip = null;
		try {
			ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\"
					+ "test\\resources\\Configuration\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	public WebDriver intialisation() {
		
	String browser=prop.getProperty("browser");
	
	if(browser.equals("chrome")) {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
	} else if(browser.equals("edge")){
		
		WebDriverManager.edgedriver().setup();
		driver =new EdgeDriver();
	}
	
	
	
	
	    driver.manage().window().maximize();
	    
	  
	    
	   driver.get(prop.getProperty("URL"));
	   
	    driver.manage().deleteAllCookies();

	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	   
	   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
	  
	   
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
	
		
		return driver;
		
		
	}
	
	
	
public void takeScreenshot(String testName,WebDriver driver) throws IOException {
		
		File SourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destinationFilePath = System.getProperty("user.dir")+"\\screenshots\\"+testName+".png";
		FileUtils.copyFile(SourceFile,new File(destinationFilePath));
	
	}


    
	
	
	

}
