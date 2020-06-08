package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPractice1 {

	public static void main(String[] args) throws IOException {
		//specify the filepath
		String filePath = System.getProperty("user.dir") + "/testdata/Test1.xlsx";
		System.out.println(filePath);
		//creat object fileinputstream
		FileInputStream fis = new FileInputStream(filePath);
		//get the object of work type
		Workbook book = new XSSFWorkbook(fis);
		// specify the sheet
		Sheet sheet = book.getSheet("sheet1");
		//get the specific row
		Row row = sheet.getRow(1);
		//get to the specific cell
		Cell cell = row.getCell(0);
		//getting the total number of the rows
		int rows = sheet.getPhysicalNumberOfRows();
		//colums are in the row so getting the number of the colum through the row
		int cols = sheet.getRow(0).getLastCellNum();
		//creating the for loop to access to all data in the rows and colums
		for (int r = 1; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				String userDetails = sheet.getRow(r).getCell(c).toString();
				System.out.println(userDetails);
			}
		}

//		String valC=sheet.getRow(1).getCell(4).toString();

	}

}
