package com.ecommerce.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomListeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {



		System.setProperty("org.uncommons.reportng.escape-output","false");
		Reporter.log("<a target=\"_blank\" href=\"C:\\Users\\way2automation\\Desktop\\Playwright_image.jpg\">Screenshot Link</a>");
		Reporter.log("<br>");
		Reporter.log("<a target=\"_blank\" href=\"C:\\Users\\way2automation\\Desktop\\Playwright_image.jpg\"><img src=\"C:\\Users\\way2automation\\Desktop\\Playwright_image.jpg\" height=200 width=200></a>");

		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
