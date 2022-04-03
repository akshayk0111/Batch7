package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe_Handle_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Akshay/Desktop/Iframe.html");
		driver.manage().window().maximize();
		
		
		//driver.switchTo().frame(0);
		driver.switchTo().frame("sauce");
		Thread.sleep(3000);
		 WebElement element =driver.findElement(By.id("user-name"));
		 Thread.sleep(3000);
		 element.sendKeys("standard-user");
		 Thread.sleep(3000);
		

		driver.close();

	}

}
