package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReadingConfig {

	public static void main(String[] args) throws IOException {
		
		String filePath="\\Users\\jamsh\\eclipse-workspace\\JavaBasics\\configs\\Configuration.properties";
		
		String userDirectory=System.getProperty("user.dir");
		System.out.println(userDirectory);
		
		String username=System.getProperty("user.name");
		System.out.println(username);
		
		String os=System.getProperty("os.name");
		System.out.println(os);
		
		String filePath1=System.getProperty("user.dir")+"/configs/configuration.properties";
		FileInputStream fis=new FileInputStream(filePath1);
		
		Properties prop=new Properties();
		prop.load(fis);
		
		String browser=prop.getProperty("browser");
		String Url=prop.getProperty("Url");
		
		System.out.println(browser);
		System.out.println(Url);
		System.out.println(prop.get("Url"));
	}
}