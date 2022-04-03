package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exmple {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();  //chrome setup // If else 
		
		WebDriver driver = new ChromeDriver();  //version   //upcasting   //object   child 4500+ 
		
		//driver.get("https://saucedemo.com/");
		
		driver.get("https://facebook.com/");
		
		driver.manage().window().maximize();
		
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		Thread.sleep(2000);
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		Thread.sleep(2000);
//		driver.findElement(By.name("login-button")).click();
//		Thread.sleep(2000);
		
		//xpath   1. absolute xpath = "/"  2. relative xpath "//" 
		
		//driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		
		//*[@id="user-name"]   /html/body/div/div[2]/div[1]/div[1]/div/form/div[1]/input
		
		//Tagname [text () =’value’]
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();   //Forgotten password?_132113
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//a[contains(text(),'For')]")).click();   //contains
		
		List<WebElement> list = driver.findElements(By.xpath("(//li[3])"));  //1 single tag 
		System.out.println("list is :");
		System.out.println(list.size());
		
		System.out.println("All list:");
		System.out.println(list);
		
		driver.close();
		
				
				
		

	}

}
