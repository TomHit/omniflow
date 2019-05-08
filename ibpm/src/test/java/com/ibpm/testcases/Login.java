package com.ibpm.testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ibpm.basetest.Basetest;

import com.ibpm.pages.Loginpage;
import com.ibpm.pages.Mainpage;
import com.ibpm.utilities.Extent_report;
import com.ibpm.utilities.Isalertpresent;
import com.ibpm.utilities.Snapshot;

public class Login extends Basetest {

	Snapshot SnapShot = new Snapshot();

	@BeforeClass
	public static void setUp() {
		initialization();
		Extent_report.startTest();

	}

	@Test(priority = 1)
	public static void validateLoginPageTitle() throws IOException, AWTException {

		String PTitle = driver.getTitle();

		Assert.assertEquals(PTitle, "Welcome To OmniFlow Process Client - Web");

		System.out.println("Test cases:validateLoginPageTitle: Passed Sucessfully");

		Snapshot.takeSnapShot(driver, "C:\\Users\\tomarh\\git\\omniflow\\ibpm\\ScreenShot\\pagetitle.png");

	}

	@Test(priority = 2)
	public static  void loginTest() throws IOException, AWTException {
		Loginpage loginPage = new Loginpage();
		String un = prop.getProperty("username");
		String pw = prop.getProperty("password");

		loginPage.username.sendKeys(un);
		loginPage.password.sendKeys(pw);
		loginPage.loginBtn.click();
		
		System.out.println("Test cases:User Login: Passed Sucessfully");
		Isalertpresent.handleAlert();

		// Snapshot.takeSnapShot(driver,
		// "C:\\Users\\tomarh\\git\\omniflow\\ibpm\\ScreenShot\\login.png");
		// Snapshot.takeSnapShot("C:\\Users\\tomarh\\git\\omniflow\\ibpm\\ScreenShot\\login.png");

		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	}

	
	

	@AfterClass
	public void tearDown() {
		Extent_report.endTest();
		driver.quit();
	}

}
