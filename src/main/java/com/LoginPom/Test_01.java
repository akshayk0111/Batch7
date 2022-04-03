package com.LoginPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_01 {

	WebDriver driver;

	@BeforeMethod
	public void BM() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void testLoginPage() {

		// LoginClass login = PageFactory.initElements(driver, LoginClass.class);
		LoginClass login = PageFactory.initElements(driver, LoginClass.class);
		login.getEmailId().sendKeys("Bugspotter");
		login.getPassword().sendKeys("123465798");
		login.getLoginbtn().click();

	}

	@AfterMethod
	public void AM() {
		driver.close();
	}

}
