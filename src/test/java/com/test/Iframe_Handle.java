package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe_Handle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Akshay/Desktop/Iframe.html");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		Thread.sleep(2000);
		driver.switchTo().frame(2); // Here we switch to 2nd frame //By index
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,400)", ""); // Scroll that particular frame
		driver.switchTo().defaultContent(); // It will navigate to default frame or content
		driver.switchTo().frame(1); // Again navigate to frame 1
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/header/nav/button/span")).click(); // here click on some functions of webside																	
		driver.switchTo().defaultContent();// It will navigate to default frame or content
		Thread.sleep(1000);
		driver.switchTo().frame("sauce"); // Search by ID or Name
		Thread.sleep(1000);
		driver.findElement(By.id("user-name")).sendKeys("standard-user");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();// It will navigate to default frame or content
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("/html/body/p/a[1]"));  //It will navigate to Given URL 
		element.click();
	
		driver.close();
		
		//driver.switchTo().parentFrame();

	}

}
