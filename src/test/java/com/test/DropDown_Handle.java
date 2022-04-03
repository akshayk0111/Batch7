package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_Handle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement drpdwn =driver.findElement(By.xpath("//select[@name='country']"));
		Select select = new Select(drpdwn);
		select.selectByIndex(5); // it will select index 5th value
		select.selectByValue("AUSTRALIA");  //we have to provide specific value then it will print that value
		select.selectByVisibleText("");
		}

}
