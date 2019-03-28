package com.ibpm.testcases;

 

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
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

public class Login extends Basetest{
	
	@BeforeClass
	public void setUp(){
		initialization();
		
	}
	
	@Test(priority=1)
	public void validateLoginPageTitle(){
	 
		
		String PTitle = driver.getTitle();
		 
		Assert.assertEquals(PTitle, "Welcome To OmniFlow Process Client - Web");
		
		System.out.println("Test cases:validateLoginPageTitle: Passed Sucessfully");
	}
	

	@Test(priority=2)
	public void loginTest(){
		Loginpage loginPage=new Loginpage();
		String un = prop.getProperty("username");
		String pw = prop.getProperty("password");
	
		loginPage.username.sendKeys(un);
		loginPage.password.sendKeys(pw);
		loginPage.loginBtn.click();
		System.out.println("Test cases:User Login: Passed Sucessfully");
		 
		//driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS) ;
	}
	
//	@Test(priority=3)
//	public void cards_ext_initiation(){
//		  
//		    try {
//		        Alert alert = driver.switchTo().alert();
//		        String alertText = alert.getText();
//		        System.out.println("Alert data: " + alertText);
//		        alert.accept();
//		    	Mainpage main=new Mainpage();
//				main.card_init.click();
//		    } catch (NoAlertPresentException e) {
//		        e.printStackTrace();
//		    }
//		}
//		
		
	
	
//	@Test(priority=4)
//	public void cards_pending(){
//		Mainpage main=new Mainpage();
//		main.card_pending.click();
//	}
//	
//	@Test(priority=5)
//	public void search_card(){
//		Mainpage main=new Mainpage();
//		main.search.sendKeys("123456789");
//	}
//	
	
	@AfterClass
	public void tearDown(){
		driver.quit();
}
	
	
	
	

}


