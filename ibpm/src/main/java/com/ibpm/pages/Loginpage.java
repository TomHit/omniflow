package com.ibpm.pages;

 

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 
import com.ibpm.basetest.Basetest;

public class Loginpage extends Basetest{
	
	//Initializing the Page Objects:
		public Loginpage(){
			PageFactory.initElements(driver, this);
		}
	

	@FindBy(xpath="//*[@id=\"loginForm:loginName\"]")
	public WebElement username;
	
	@FindBy(xpath="//*[@id=\"loginForm:password\"]")
	public WebElement password;
	
	 
	
	
	@FindBy(xpath="//*[@id=\"loginForm:buttonlogin\"]")
	public WebElement loginBtn;
	
	 
	

	 
	public void login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		//loginBtn.click();
		    	JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].click();", loginBtn);
		    	
	 
	}
	
}


