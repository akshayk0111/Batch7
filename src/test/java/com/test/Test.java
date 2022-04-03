package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws InterruptedException { // throws exception because thread is applied .

		WebDriverManager.chromedriver().setup(); // setup for chrome browser

		WebDriver driver = new ChromeDriver(); // create chrome driver class browser object

		driver.get("https://www.google.com/"); // get the link for execution

		driver.manage().window().maximize(); // maximize current open window

		Thread.sleep(5000); // window will sleep for 5 sec //thread concept

		driver.navigate().to("https://www.facebook.com/"); // it has function of execute another URL

		Thread.sleep(5000);
		driver.navigate().back(); // it will go to back page of website
		Thread.sleep(5000);

		driver.navigate().forward(); // forward the website
		Thread.sleep(5000);
		driver.navigate().refresh(); // refresh the current page

		Thread.sleep(5000);

		String title = driver.getTitle(); // it will show the title of particular page //inside console
		System.out.println(title); // it will validate the URL

		String cURL = driver.getCurrentUrl(); // it will print the current website URL inside console
		System.out.println(cURL);// it will validate the current URL

		Thread.sleep(5000);

		driver.close(); // it will close browser

	}

}
