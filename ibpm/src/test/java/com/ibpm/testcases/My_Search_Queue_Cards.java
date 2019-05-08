package com.ibpm.testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ibpm.basetest.Basetest;
import com.ibpm.pages.Mainpage;
import com.ibpm.utilities.Extent_report;

public class My_Search_Queue_Cards extends Basetest {
	@BeforeClass
	public static void setUp() {
		initialization();
		Extent_report.startTest();

	}
	
	@Test
	public void My_search_Queue_Cards() throws IOException, AWTException {
		Search_cards_trn.Search_CARD_TRN();
		Mainpage main = new Mainpage();
		main.registration_no.click();

		// It will return the parent window name as a String
		String parent = driver.getWindowHandle();

		// This will return the number of windows opened by Webdriver and will return
		Set<String> s1 = driver.getWindowHandles();

		// Now we will iterate using Iterator
		Iterator<String> I1 = s1.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			// Here we will compare if parent window is not equal to child window then we
			// will close

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				main.close.click();

			}
		}

	}
	
	@AfterClass
	public void tearDown() {
		Extent_report.endTest();
		driver.quit();
	}

}
