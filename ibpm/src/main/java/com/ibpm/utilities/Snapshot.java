package com.ibpm.utilities;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.xml.transform.OutputKeys;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Snapshot {
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws IOException{

	//public static void takeSnapShot(String fileWithPath) throws IOException, AWTException {
		
		 //Convert web driver object to TakeScreenshot
		 
		  TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		  
		  //Call getScreenshotAs method to create image file
		  
		  File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		  
		  //Move image file to new destination
		  
		 File DestFile=new File(fileWithPath);
		  
		  //Copy file at destination
		  
		  FileUtils.copyFile(SrcFile, DestFile);
		 
		// FileUtils.copyFile(SrcFile, new File("c:\\screenshots\\"+Filename+".jpg"));;
/*
		Robot robot = new Robot();
		// create rectangle for full screenshot
		Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		// capture screen of the desktop
		BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
		
		// save the screenshot to local system
		ImageIO.write(screenFullImage, "png", new File(fileWithPath));

		System.out.println("Full Desktop screenshot saved!");
*/
	}

}
