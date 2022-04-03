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

public class ScreenShot_Practice {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://reqres.in/");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		//WebElement element = driver.findElement(By.xpath("//*[@id=\"technical-bits\"]/ul/li[1]/p[1]/strong"));
		

		//js.executeScript("arguments[0].scrollIntoView()", element);

		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,1200)", "");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-1200)", "");
		Thread.sleep(2000);
		String src = RandomString.make(4);

		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);

		File aa = new File("C:\\Users\\Akshay\\Desktop\\New folder\\" + src + ".png");

		org.openqa.selenium.io.FileHandler.copy(file, aa);

		driver.close();

	}

}
