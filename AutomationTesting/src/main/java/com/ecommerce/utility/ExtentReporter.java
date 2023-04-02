package com.ecommerce.utility;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {
	
	static ExtentReports extentReprt;
	
	
	public static  ExtentReports getExtentReport() {
		
		String extentReportPath = System.getProperty("user.dir") +"\\reports\\extentreport_"+ExtentReporter.getCurrentTime()+".html";
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(extentReportPath);
		
		reporter.config().setReportName("Automation Test Result");
		
		reporter.config().setDocumentTitle("Test Result");
		
		extentReprt = new ExtentReports();
		
		extentReprt.attachReporter(reporter);
		
		extentReprt.setSystemInfo("OS", "Windows 10");
		
		extentReprt.setSystemInfo("Tested By", "Damini Pophali");
		
		return extentReprt;
		
		
		
		
		
		
		
	}
	
	public static String getCurrentTime() {
		
		String CurrentDate = new SimpleDateFormat("yyyy-MM-dd-hhmmss").format(new Date());
		
		return CurrentDate;
	}
	
	

}
