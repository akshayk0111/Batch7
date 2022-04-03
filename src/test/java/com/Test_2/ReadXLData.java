package com.Test_2;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadXLData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		ReadXLData rd = new ReadXLData();
		rd.getData("Sheet1");

	}

	public String[][] getData(String sheetname) throws EncryptedDocumentException, IOException {
		File f = new File("C:\\Users\\Akshay\\Desktop\\ExcelSheet\\SheetData.xlsx");
		FileInputStream fls = new FileInputStream(f);

		Workbook book = WorkbookFactory.create(fls);
		Sheet sheetname1 = book.getSheet(sheetname);

		int totalRows = sheetname1.getLastRowNum();
		System.out.println(totalRows);

		Row rowCells = sheetname1.getRow(0);

		int totalcolumns = rowCells.getLastCellNum();
		System.out.println(totalcolumns);

		DataFormatter format = new DataFormatter();

		String testData[][] = new String[totalRows][totalcolumns];

		for (int i = 1; i <= totalRows; i++) {
			for (int j = 0; j <= totalcolumns; j++) {
				testData[i - 1][j] = format.formatCellValue(sheetname1.getRow(i).getCell(j));
				System.out.println(testData[i -1][j]);
			}
		}
		return testData;

	}
}
