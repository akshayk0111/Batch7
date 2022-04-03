package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xPAth_example {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup(); //webdrivermanager
		
		WebDriver driver = new ChromeDriver();  //chrome 
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		//xpath  1.absoluete '/'  2.relative '//'
		//1
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard-user");
		
		//2 
		
		
		
		
		

	}

}
