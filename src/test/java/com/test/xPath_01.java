package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xPath_01 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement emailId = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));

		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));

		emailId.sendKeys("Akshay0111");
		pass.sendKeys("Akshay");
		login.click();

		Thread.sleep(1000);
		List<WebElement> list = driver.findElements(By.tagName("//a"));
		Thread.sleep(1000);

		System.out.println(list.size()); // 47 links
		driver.close();

	}

}

//Q. how to identify broken links 
