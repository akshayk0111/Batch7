package com.Mouse;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Actions_Class_2 {

	@Test
	public void Click_Gmail() throws IOException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();

		WebElement click = driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions act = new Actions(driver);
		act.moveToElement(click).click().build().perform();

		String image = RandomString.make(5);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File typo = ts.getScreenshotAs(OutputType.FILE);
		File location = new File("C:\\Users\\Akshay\\Desktop\\Test Cases\\" + image + ".png");
		org.openqa.selenium.io.FileHandler.copy(typo, location);

		driver.close();

	}

	@Test
	public void DragNDrop() throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();

		Actions act = new Actions(driver);

		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement destn = driver.findElement(By.xpath("//li[@class='placeholder'][1]"));
		Thread.sleep(2000);
		WebElement source1 = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement destn1 = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		Thread.sleep(2000);

		WebElement source2 = driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement destn2 = driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		Thread.sleep(2000);

		WebElement source3 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement destn3 = driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));

		act.dragAndDrop(source, destn).build().perform();
		act.dragAndDrop(source2, destn2).build().perform();
		act.dragAndDrop(source3, destn3).build().perform();
		Thread.sleep(2000);
		String image1 = RandomString.make(6);
		Thread.sleep(2000);
		TakesScreenshot ts1 = (TakesScreenshot) driver;

		File typo1 = ts1.getScreenshotAs(OutputType.FILE);

		File location1 = new File("C:\\Users\\Akshay\\Desktop\\Test Cases\\" + image1 + ".png");

		FileHandler.copy(typo1, location1);

		driver.close();

	}

}
