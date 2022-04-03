package com.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup_Child_Browser {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/popup.php");
		
		driver.manage().window().maximize();
		
				
		String parentwindow =driver.getWindowHandle();
		System.out.println(parentwindow);
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> set = driver.getWindowHandles();  // id //adrress  // both parent and child window 
		System.out.println(set);
		
		 Iterator<String> it =set.iterator();
		 
		 
		 while(it.hasNext())
		 {
			String childWindowId =  it.next();
			
			if(!parentwindow.equalsIgnoreCase(childWindowId))
			{
				
				driver.switchTo().window(childWindowId);
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Akshay");
				
				Thread.sleep(20000);
				driver.close();
			}
			
			
		 }
		 driver.switchTo().window(parentwindow);
			Thread.sleep(2000);
			driver.close();
		 
		//[CDwindow-6547A8DD21AE5C123212CD43C677636D, CDwindow-D74F926768BD9C71DA54A11A7A656C61]

		
		
	}

}
