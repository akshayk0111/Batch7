package com.Test_2;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataProvider_1 {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		String path = "C:\\Users\\Akshay\\Desktop\\ExcelSheet\\SheetData.xlsx";

		FileInputStream file = new FileInputStream(path);

		XSSFWorkbook book = new XSSFWorkbook(file);

		String data = book.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();

		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(data);

		System.out.println(data);
		


		// Read Numeric data

		double data1 = book.getSheet("Sheet1").getRow(2).getCell(0).getNumericCellValue();
		
		System.out.println(data1);
		
		//String convert data = String.valueOf(data1);  //not working 
		
		//System.out.println(converdata);

		driver.close();
		book.close();

	}

}
