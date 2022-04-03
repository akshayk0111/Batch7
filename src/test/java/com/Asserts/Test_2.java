package com.Asserts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_2 {  //expected result then we haev to use assets and add conditions 
	
	@Test
	public void test1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		System.out.println(email.isEnabled());
		Assert.assertTrue(email.isEnabled(), "verify field email");
		if(email.isEnabled()==false)
		{
			email.sendKeys("Bugs");
		}else {
			Assert.assertTrue(email.isEnabled(),"Email is enabled");
		}
		
		
	}

}
