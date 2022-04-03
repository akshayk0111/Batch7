package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup_Handle {
	

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='submit']")).click();

		// alert Handling

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();

		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		Thread.sleep(2000);

		alert1.accept();

		driver.close();

	}

}
