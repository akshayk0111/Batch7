package com.TestNG;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Browser_demo {

	public WebDriver driver;

	@BeforeMethod
	public void BrowserOpen() {
		System.out.println("Browser opened");
	}

//	WebDriverManager
//	driver  = new ChromeDriver();
//	
//	driver.get("https://www.google.com/");

	@Test
	public void Test1() {
		System.out.println("Test");
	}

	@Test
	public void Test2() {
		System.out.println("Test 2");
	}

	@Test
	public void Test3() {
		System.out.println("Test 3"); // 3 times browser will execute
	}

//	Thread.sleep(2000);

	@AfterMethod
	public void BrowserClose() {
		System.out.println("Browser closed");
	}
	// driver.close();
}
