package com.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard_Actions {
	@Test
	public void verify_test_01() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		 WebElement element = driver.findElement(By.xpath("//input[@name='email']"));
		 //element.sendKeys("BUGSPOTTER");
		

		// With - keyboard

		Actions act = new Actions(driver);
		act.keyDown(element, Keys.SHIFT).sendKeys("bugspotter").keyUp(Keys.SHIFT).build().perform();

			
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();  //ctrl a 
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();  // ctrl c
		Thread.sleep(2000);
		WebElement password =driver.findElement(By.xpath("//input[@id='pass']"));
		password.click();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		//act.sendKeys(Keys.TAB);
		
		
		
		
	}  //with keyboard copy paste options use 
		//ctrl A
		// ctrl c
		//element click
		// ctrl v
	

}
