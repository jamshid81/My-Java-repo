package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception {

	public static void main(String[] args) {
	
	try {
		tempCheck(30);
	}catch (RuntimeException er) {
		System.out.println(er);
		
	}
		//int a = 10, b = 0, result;
//		try {
//			result = a / b;
//		} catch (ArithmeticException e) {
//			System.out.println(e.getLocalizedMessage());
//		}
//		String[] array = { "alpha", "beta", "Gama" };
//		try {
//			System.out.println(array[3]);
//		}catch (IndexOutOfBoundsException e) {
//			e.printStackTrace();
//		}
//		String filePath="";
//		try {
//		FileInputStream fis = new FileInputStream(filePath);
//		}catch(FileNotFoundException e) {
//			System.out.println(e);
		}
	public static void tempCheck(int degree) {
		if (degree<32) {
			throw new RuntimeException("It is freezing");
		}else {
			System.out.println("It is not too cold");
		}
	}
		}
	
