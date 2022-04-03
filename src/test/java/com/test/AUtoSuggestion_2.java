package com.test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AUtoSuggestion_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).click();
		Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).click();
		
		Thread.sleep(2000);
		

	}

}
