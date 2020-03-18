package com.syntax.class05;

import java.util.Scanner;

public class Recap {
public static void main(String[]args) {
	Scanner input=new Scanner (System.in);
	System.out.println("Please enter a text");
	String text=input.nextLine();
	System.out.println("Please enter another text");
	String text1=input.next();
	System.out.println(text+" "+text1);
	System.out.println("Please enter a number");
	int num=input.nextInt();
	System.out.println("Please enter a decimal number");
	double num1=input.nextDouble();
	System.out.println(num+num1);
	
}
}
