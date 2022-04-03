package com.Test_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelData_Method {
	
	public void getStringData(String Sheetname , int row, int cell) throws IOException {
		
		String path = "C:\\Users\\Akshay\\Desktop\\ExcelSheet\\SheetData.xlsx";
		
		FileInputStream data = new FileInputStream(path);
		
		XSSFWorkbook book = new XSSFWorkbook(data);
		
		
		
		int getlast = book.getSheet("Sheet1").getLastRowNum();
		
		for(int i=0;i<=getlast;i++)
		{
			String provide =  book.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
			
			
			System.out.println(provide);
		}
		
		book.close();
		
	}

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		


		
		driver.close();
	}

}
