package com.test;

import java.io.File;

import java.io.IOException;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestions_DROPDOWN {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		WebElement drpdwn = driver.findElement(By.xpath("//input[@name='q']"));  //search 
		Thread.sleep(2000);

		drpdwn.sendKeys("maven");
		Thread.sleep(2000);

		List<WebElement> list = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li"));  // // prvide value 
		System.out.println(list.size());
		Thread.sleep(2000);
		
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  //it is a interface 
		File scrn = new File("H:\\JavaWorkspace_bugspotter\\SeleniumTraining\\test.png");
		//FileHandler.copy(file, scrn);
		
		//org.openqa.selenium.io.FileHandler.copy(file, scrn);
		
		FileHandler.copy(file, scrn);
		

		
		
		System.out.println(list.get(0).getText());

		// list.get(0).click(); // here we get 0th index value

		for (int i = 0; i < list.size(); i++) // here we get your choice value
		{
			if (list.get(i).getText().equals("maven repository")) {
				Thread.sleep(2000);
				list.get(i).click();
			}
		}
		System.out.println(driver.getCurrentUrl());

	}

}
//stalelementreferanceexception == means it is old element 