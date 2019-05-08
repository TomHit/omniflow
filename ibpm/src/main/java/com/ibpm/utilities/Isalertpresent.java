package com.ibpm.utilities;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

import com.ibpm.basetest.Basetest;

public class Isalertpresent extends Basetest {
	//public static WebDriver driver;

	public static void handleAlert() throws IOException, AWTException {

		 
		if ( isAlertPresent()==true) {

			Alert alert = driver.switchTo().alert();

			System.out.println(alert.getText());
			//Snapshot.takeSnapShot(driver, "C:\\Users\\tomarh\\git\\omniflow\\ibpm\\ScreenShot\\alert.png");
			// Snapshot.takeSnapShot("C:\\Users\\tomarh\\git\\omniflow\\ibpm\\ScreenShot\\alert.png");

			alert.accept();

		}

	}
	public  static  boolean isAlertPresent() {

		try {

			driver.switchTo().alert();

			return true;

		} catch (NoAlertPresentException ex) {

			return false;

		}

	}
}
