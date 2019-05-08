package com.ibpm.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ibpm.basetest.Basetest;
import com.ibpm.pages.Mainpage;
import com.ibpm.utilities.Extent_report;

public class Search_cards_trn extends Basetest {
	
	@BeforeClass
	public static void setUp() {
		initialization();
		Extent_report.startTest();

	}
	
	@Test 
	public static void Search_CARD_TRN() throws IOException, AWTException {
		
		Login.loginTest();
		Mainpage main = new Mainpage();
		main.search.sendKeys("123456789");
		WebElement elm = driver.findElement(By.xpath("//*[@id=\"quickSrchMnu\"]"));
		Select act = new Select(elm);
		act.selectByVisibleText("CARDS TRN");
		main.go.click();

	}
	
	@AfterClass
	public void tearDown() {
		Extent_report.endTest();
		driver.quit();
	}


}
