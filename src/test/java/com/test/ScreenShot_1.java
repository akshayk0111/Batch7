package com.test;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class ScreenShot_1 {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup(); 
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Desktop\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");  // Link provided
		driver.manage().window().maximize();// Maximize the window
		
		String rm =RandomString.make(3);  //3 is string name of image 
		
		TakesScreenshot ts = (TakesScreenshot) driver;  // casting ts to driver
		File src=ts.getScreenshotAs(OutputType.FILE); // here we declare type of file 
		
		File destn = new File("C:\\Users\\Akshay\\Desktop\\New folder\\"+rm+".png"); //here we give location and random name
		
		org.openqa.selenium.io.FileHandler.copy(src, destn);
		
		driver.close();
		
	}

}
