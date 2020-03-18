package com.syntax.class05;

import java.util.Scanner;

public class HomeWork4 {
	public static void main(String[] args) {
		Scanner comparison;
		comparison = new Scanner(System.in);
		System.out.println("Please enter tow word");
		String word1;
		String word2;
		word1 = comparison.nextLine();
		word2 = comparison.nextLine();

		System.out.println("Please enter two number");

		int number1;
		int number2;
		number1 = comparison.nextInt();
		number2 = comparison.nextInt();
		String word;

		if (word1.equals(word2) && number1 == number2) {
			word = ("AND");
		} else if (word1.equals(word2) || number1 == number2) {
			word = ("OR");
			
		} else {
			word = ("NONE");
		}
		System.out.println(word);
	}
}
