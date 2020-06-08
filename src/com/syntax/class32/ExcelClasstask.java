package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelClasstask {

	public static void main(String[] args) throws IOException {
		//first we have to creat the filepath(location of our file)
		String filePath="/Users/jamsh/Documents/Test.xlsx";
		//now we have to creat the objec to fileinputstream(to read/retrieve data)
		FileInputStream fis= new FileInputStream(filePath);	
		//now we have to get an object of file type; meaning creat the object of excell workbook(excellfile)
		Workbook book=new XSSFWorkbook(fis);
		//have to find the excel sheet
		Sheet sheet=book.getSheet("Sheet2");
		
		//need to find the number of row
		int row=sheet.getPhysicalNumberOfRows();
		//need to find number of colomns
		int cols=sheet.getRow(0).getLastCellNum();
		
		System.out.println(row);
		System.out.println(cols);
		for (int r=0; r<row; r++) {
			for (int c=0; c<cols;c++) {
				String value;
				value=sheet.getRow(r).getCell(c).toString();
				System.out.print(value+" ");
			
			}
			System.out.println();
		}
		
		

	}

}
