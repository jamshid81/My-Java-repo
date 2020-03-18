package com.syntax.class04;

import java.util.Scanner;

public class ScanclassHW {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter you age");
		int age=scan.nextInt();
		System.out.println("Please enter your gender M or F?");
		String gender=scan.next();
		if (age>=25 &&(gender.equals("F"))) {System.out.println("Woman"); 
	}else if (age<25&& (gender.equals("F"))) {System.out.println("Girl");
	}else if  (age>=25&&(gender.contentEquals("M"))) {System.out.println("Man");
	}else {System.out.println("Boy");
	
		}}

}

