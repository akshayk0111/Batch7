package com.test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Scrolling_Page {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		// scrollBy pixel
		JavascriptExecutor js = (JavascriptExecutor) driver;  //javascriptExecuter is interface 
		js.executeScript("window.scrollBy(0,600)", "");  // methods
		Thread.sleep(2000);

		// reverse of page

		js.executeScript("window.scrollBy(0,-600)", "");

		String rm = RandomString.make(3);  //Random String have make method 
		TakesScreenshot ts = (TakesScreenshot) driver; // casting ts to driver
		File src = ts.getScreenshotAs(OutputType.FILE); // here we declare type of file

		File destn = new File("C:\\Users\\Akshay\\Desktop\\ScreenShots" + rm + ".png"); // here we give location and
																							// random name

		org.openqa.selenium.io.FileHandler.copy(src, destn); // filehandler

		// scroll by element

		WebElement element =driver.findElement(By.xpath("//a[@title='Show more languages']"));
		js.executeScript("arguments[0].scrollIntoView()", element);  //It is javascript method // static method 
 
	}

}
