package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellRepap {

	public static void main(String[] args) {
		String file = System.getProperty("user.dir") + "/testdata/Test1.xlsx";

		try {
			FileInputStream fis = new FileInputStream(file);

			Workbook book = new XSSFWorkbook(fis);

			Sheet sheet = book.getSheet("sheet2");

			int rows = sheet.getPhysicalNumberOfRows();

			int cols = sheet.getRow(0).getLastCellNum();

			List<Map<String, String>> xlMap = new ArrayList<>();

			for (int r = 1; r < rows; r++) {

				Map<String, String> map = new LinkedHashMap<>();

				for (int c = 0; c < cols; c++) {

					String key = sheet.getRow(0).getCell(c).toString();

					String value = sheet.getRow(r).getCell(c).toString();

					map.put(key, value);
				}
				xlMap.add(map);
			}
			System.out.println(xlMap);

			System.out.println(" ----- accessing each map separately -------    ");

			for (Map<String, String> map1 : xlMap)
				System.out.println(map1);
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}

	}
}
