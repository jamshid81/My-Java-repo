package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoop2 {

	public static void main(String[] args) {
		Scanner lottery = new Scanner(System.in);
		int number;
		int luckyNumber = 17;

		do {
			System.out.println("Please enter any number from 1 to 20");
			
			number = lottery.nextInt();

		} while (number != luckyNumber);
		// intill the condition is true the compiler will ask to enter number, once the
		// condition is false then
		// it will print the next sysout!

		System.out.println("You got it !!!!");

	}
}// when we dont know how many times we are need to enter a number it is best to use "Do while"
//else we should use the "while" only
