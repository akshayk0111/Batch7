package com.Test_Cases;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Amazon_TestCases {
	
	@Test
	
	public void Checking() throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
		
		element.click();
		Thread.sleep(2000);
		element.sendKeys("iphone 13");
		Thread.sleep(2000);
		element.sendKeys(Keys.ARROW_DOWN);
		element.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
				
		JavascriptExecutor js = (JavascriptExecutor) driver;	
		WebElement element2 = driver.findElement(By.xpath("(//span[text()='Apple iPhone 13 (128GB) - Midnight'])[4]"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView()", element2);
		Thread.sleep(2000);
		element2.click();
		
		
		String parentwindow = driver.getWindowHandle();
		driver.switchTo().window(parentwindow);
		System.out.println(parentwindow);
		
		Set<String> set = driver.getWindowHandles();
		System.out.println(set);
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext())
		{
			String ChildWindow = itr.next();
			
			if(!parentwindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				
				//add to cart 
				driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"sw-gtc\"]/span/a")).click();
				Thread.sleep(2000);
				
				//TakesScreenShot
				String random = RandomString.make(5);
				TakesScreenshot ts = (TakesScreenshot) driver;
				File files = ts.getScreenshotAs(OutputType.FILE);
				
				File save = new File("C:\\Users\\Akshay\\Desktop\\Test Cases\\"+random+".png");
				FileHandler.copy(files, save);
				//webelement identify 
				//get text 
				// and Asserts.equlas compare karo
				driver.findElement(By.xpath("//*[@id=\"sc-item-C8d8b2576-a5b7-4509-a1c0-fab8ae407838\"]/div[4]/div/div[1]/div/div/div[2]/div[1]/span[2]/span/input")).click();
				System.out.println();
				
			}
		}
	}
	
	@Test
	public void child() {
		
		
		
	}

}
