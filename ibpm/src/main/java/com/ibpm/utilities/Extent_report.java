package com.ibpm.utilities;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Extent_report {
	static ExtentTest test;
	static ExtentReports report;

	
	//@BeforeClass
	
	public static void startTest()
	
	{
	
	report = new ExtentReports(System.getProperty("user.dir")+"/src/main/java/com/ibpm"
				+ "/utilities/ExtentReportResults.html");
	
	test = report.startTest("ExtentDemo");
	
	}
	
	//@AfterClass
	
	public static void endTest()
	
	{
	
	report.endTest(test);
	report.flush();
	
	}



}
