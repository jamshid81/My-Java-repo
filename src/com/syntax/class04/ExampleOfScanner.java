package com.syntax.class04;

import java.util.Scanner;

public class ExampleOfScanner {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = scan.nextLine();
		/*
		 * to capture a text we have to type String ID=scan.nextLing
		 *
		 * for capturing number it should be type int ID=scan.nextInt
		 */
		System.out.println("My name is " + name);
		System.out.println("How old are you");
		int age = scan.nextInt();
		System.out.println("Your name is " + name + " your age is " + age);
		
	}
}
