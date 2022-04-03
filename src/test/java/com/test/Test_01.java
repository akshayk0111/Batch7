package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_01 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//identify webelemnt through ID  = emailid 
		
		WebElement emailid= driver.findElement(By.id("email"));  // find through id
		emailid.sendKeys("Bugspotter");

		//password by name 
		
		//driver.findElement(By.className("pass")).sendKeys("12345678");  //no method showing for name 
		
		driver.findElement(By.tagName("button")).click();
		
	}

}
