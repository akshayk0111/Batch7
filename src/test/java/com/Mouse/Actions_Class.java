package com.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_Class {

	@Test
	public void verify_actionsConcepts() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions act = new Actions(driver);
		act.moveToElement(gmail).click(gmail).build().perform();  // if two more actions we have to call built 
		//built.perform is compulasory 
		//act.contextClick();  //when we have to click on right click 
		//act.doubleClick(); // double click //arguments and without arguments 
		//act.dragAndDrop(source , destination); // guru 99 website 

	}

}
