package com.ibpm.testcases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ibpm.basetest.Basetest;

import com.ibpm.pages.Loginpage;
import com.ibpm.pages.Mainpage;

public class Login extends Basetest {

	@BeforeClass
	public void setUp() {
		initialization();

	}

	@Test(priority = 1)
	public void validateLoginPageTitle() {

		String PTitle = driver.getTitle();

		Assert.assertEquals(PTitle, "Welcome To OmniFlow Process Client - Web");

		System.out.println("Test cases:validateLoginPageTitle: Passed Sucessfully");
	}

	@Test(priority = 2)
	public void loginTest() {
		Loginpage loginPage = new Loginpage();
		String un = prop.getProperty("username");
		String pw = prop.getProperty("password");

		loginPage.username.sendKeys(un);
		loginPage.password.sendKeys(pw);
		loginPage.loginBtn.click();
		System.out.println("Test cases:User Login: Passed Sucessfully");

		// driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS) ;
	}

	// @Test(priority=3)
	// public void cards_ext_initiation(){
	//
	// try {
	// Alert alert = driver.switchTo().alert();
	// String alertText = alert.getText();
	// System.out.println("Alert data: " + alertText);
	// alert.accept();
	// Mainpage main=new Mainpage();
	// main.card_init.click();
	// } catch (NoAlertPresentException e) {
	// e.printStackTrace();
	// }
	// }
	//

	// @Test(priority=4)
	// public void cards_pending(){
	// Mainpage main=new Mainpage();
	// main.card_pending.click();
	// }
	//
	// @Test(priority=5)
	// public void search_card(){
	// Mainpage main=new Mainpage();
	// main.search.sendKeys("123456789");
	// }
	//

	@Test(priority = 3)
	public void custom_card() {
		driver.findElement(By.xpath("//*[@id=\"myMenuID\"]/table/tbody/tr/td/a")).click();

		// It will return the parent window name as a String
		String parent = driver.getWindowHandle();

		// This will return the number of windows opened by Webdriver and will return
		// Set of St//rings
		Set<String> s1 = driver.getWindowHandles();

		// Now we will iterate using Iterator
		Iterator<String> I1 = s1.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			// Here we will compare if parent window is not equal to child window then we
			// will close

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				System.out.println(driver.switchTo().window(child_window).getTitle());

				// driver.close();
			}

		}

		driver.findElement(By.xpath("//*[@id=\"preferencesForm\"]/table/tbody/tr/td/table/tbody/tr/td/label/a"))
				.click();

		driver.close();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
