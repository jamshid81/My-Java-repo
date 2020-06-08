package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {

	public static void main(String[] args) throws IOException {
		// Write into existing file and add value
		
		String filePath="\\Users\\jamsh\\eclipse-workspace\\JavaBasics\\configs\\Examples.properties";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Properties prop=new Properties();
		
		prop.load(fis);
		//we have to load first, or else it will overwritten onto the file key and valu
		//and delet the previuse one
		
		prop.setProperty("phoneNumber", "4533565434");
		
		FileOutputStream fos=new FileOutputStream(filePath);
		
		prop.store(fos, "Added additional key");
		

	}

}
