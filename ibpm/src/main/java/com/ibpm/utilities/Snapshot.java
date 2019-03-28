package com.ibpm.utilities;

import java.io.File;

import javax.xml.transform.OutputKeys;

 
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Snapshot {
	
	
	public void takesnapshot(WebDriver driver,String Filepath) throws Exception{
		
		/*webdriver does not have getscreenshotAs() method to caputured the picture ,only TakesScreenshot interface has the method getscreenshotAS so that to take the screen shot need to do casting.
		driver is able to take screen shot please cast it to TakesScreenshot type.*/

		TakesScreenshot srcshot= ((TakesScreenshot)driver);
		
		 //Call getScreenshotAs method to create image file
		File srcFile=srcshot.getScreenshotAs(OutputType.FILE);
		
		 //Move image file to new destination
		
		File Destfile=new File(Filepath);
		
		//Copy file at destination
		
		
		
		
		
	}

}
