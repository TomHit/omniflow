package com.ibpm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ibpm.basetest.Basetest;

public class Mainpage extends Basetest {
	
	//Initializing the Page Objects:
			public  Mainpage(){
				PageFactory.initElements(driver, this);
			}
		
	 
		@FindBy(xpath="//*[@id=\"queuetable\"]/tbody/tr[9]/td/a/span")
		public WebElement card_init;
		
		@FindBy(xpath="//*[@id=\"queuetable\"]/tbody/tr[12]/td/a/span")
		public WebElement card_pending;
		
		@FindBy(xpath="//*[@id=\"loginName\"]")
		public WebElement search;
		
		@FindBy(xpath="//*[@id=\"quickSrchMnu\"]")
		public WebElement On;
		
		@FindBy(xpath="//*[@id=\"buttonGo\"]")
		public WebElement go;
		
		@FindBy(xpath= "//*[@id=\"linkid0\"]")
		public WebElement registration_no;
		
		@FindBy(xpath= "//*[@id=\"myMenuID\"]/table/tbody/tr/td[5]/a")
		public WebElement close;
		
		
	
	
		
		
}
