package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.*;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ClassTask {

	public static void main(String[] args) throws IOException {

		String filePath = System.getProperty("user.dir") + "/testdata/Test1.xlsx";
		// \Users\jamsh\eclipse-workspace\JavaBasics\testdata\Test1.xlsx
		FileInputStream file = new FileInputStream(filePath);
		// creating object of excel file
		Workbook book = new XSSFWorkbook(file);
		// accessing the sheet
		Sheet sheet = book.getSheet("sheet1");
		// finding total number of the rows;

		int rows = sheet.getPhysicalNumberOfRows();
		System.out.println(rows);
		// get one row
		Row row = sheet.getRow(0);
		// get number of cell
		int cells = row.getLastCellNum();
		System.out.println(cells);
		// getting specific cell data
		Cell cell = row.getCell(0);
		System.out.println(cell);
		for (int c=0; c<cells;c++) {
			Cell key=row.getCell(c);
		System.out.print(key+" ");
				
		}
//		for (int row = 1; row < rows; row++) {
//			//for every row, I will iterate the cells
//			
//			//Let's get the current row
//			Row curRow = sheet.getRow(row);
//			
//			//How many cells there are in the current row
//			int curCells = curRow.getLastCellNum();
//			
//			for (int cell = 0; cell < curCells; cell++) {
////				Cell cellData = curRow.getCell(cell);
////				String cellStringData = cellData.toString();
////				System.out.print(cellStringData + " ");
//				System.out.print(curRow.getCell(cell).toString() + " ");	
//			}
		System.out.println();
		for (int r=0;r<rows;r++) {
			
			//getting current row
			Row curRow=sheet.getRow(r);
			
			for (int col=0;col<cells;col++) {
				
				String cellData=curRow.getCell(col).toString();
				
//				String data=cellData.toString();
				
				System.out.print(cellData+" ");
				
			}
			System.out.println();
			
				
			}
		
		
			
		}
		

	}
