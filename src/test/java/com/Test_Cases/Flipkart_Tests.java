package com.Test_Cases;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
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

public class Flipkart_Tests {
	
//	static void takesscreenshot() {
//		
//
//		
//
//		String random = RandomString.make(5); // ss name automatically
//
//		TakesScreenshot ts = (TakesScreenshot) driver;
//
//		File file = ts.getScreenshotAs(OutputType.FILE);
//
//		File location = new File("C:\\Users\\Akshay\\Desktop\\Test Cases\\" + random + ".png");
//
//		// scrnshor name random ..name ? 1234556 ..10
//
//		FileHandler.copy(file, location);
//		
//	}

	@Test

	public void flipcart() throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup(); // what is webdrivermanagaer? // firefox //explore if else
		WebDriver driver = new ChromeDriver(); // what is webdriver //casting webdriver interface p[arent = chorome
												// chilld
		driver.get("https://www.myntra.com/"); // what is get
		driver.manage().window().maximize(); //
		Thread.sleep(2000);

		WebElement element = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		element.click();
		Thread.sleep(2000);
		element.sendKeys("shirt men");
		Thread.sleep(2000);
		element.sendKeys(Keys.ARROW_DOWN);
		element.sendKeys(Keys.ARROW_DOWN);
		element.sendKeys(Keys.ARROW_DOWN);
		element.sendKeys(Keys.ARROW_DOWN);
		element.sendKeys(Keys.ARROW_DOWN);
		element.sendKeys(Keys.ARROW_DOWN);

		element.sendKeys(Keys.ENTER);

		driver.findElement(
				By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[4]/a/div[1]/div/div/div/picture/img"))
				.click();

		String parent = driver.getWindowHandle();
		driver.switchTo().window(parent);

		Set<String> set = driver.getWindowHandles(); // 12 2 3 3214 1234 134 1

		Iterator<String> itr = set.iterator();

		while (itr.hasNext()) { // parent t shirt - child open tshirt

			String child = itr.next();

			if (!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);

				// handle child

				driver.findElement(By.xpath("(//p[@class='size-buttons-unified-size'])[3]")).click();

				driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div/div/main/div[2]/div[2]/div[3]/div/div[1]"))
						.click();
				Thread.sleep(2000);
				driver.findElement(
						By.xpath("//*[@id=\"mountRoot\"]/div/div/div/main/div[2]/div[2]/div[3]/div/a/span[1]")).click();

				// scrrenshot
				
				JavascriptExecutor js = (JavascriptExecutor) driver;

				js.executeScript("window.scrollBy(0,200)", "");
				
				
				//takesscreenshot();

//				JavascriptExecutor js = (JavascriptExecutor) driver;
//
//				js.executeScript("window.scrollBy(0,200)", "");
//
//				String random = RandomString.make(5); // ss name automatically
//
//				TakesScreenshot ts = (TakesScreenshot) driver;
//
//				File file = ts.getScreenshotAs(OutputType.FILE);
//
//				File location = new File("C:\\Users\\Akshay\\Desktop\\Test Cases\\" + random + ".png");
//
//				// scrnshor name random ..name ? 1234556 ..10
//
//				FileHandler.copy(file, location);

//				driver.switchTo().frame("Ok,Got it");
//				Thread.sleep(2000);
//				driver.switchTo().defaultContent();

				driver.findElement(By.xpath("//*[@id=\"cartItemsList\"]/div/div/div/div/div[1]/div/div[1]")).click();
				driver.findElement(
						By.xpath("//*[@id=\"appContent\"]/div/div/div/div/div[1]/div[5]/div[3]/div[1]/button")).click();

//				Alert alert = driver.switchTo().alert();
//				alert.accept();

				driver.findElement(By.xpath(
						"//*[@id=\"appContent\"]/div/div/div/div/div[1]/div[5]/div[4]/div/div/div[2]/div[1]/button"))
						.click();

			}

		}

	}

}
