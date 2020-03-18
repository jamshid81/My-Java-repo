package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoops {

	public static void main(String[] args) {
		Scanner input;
		String name;
		int num = 1;
		// we want to ask user's name and print Good Agternoon___;

		input = new Scanner(System.in);
		while (num <= 3) {
			System.out.println("What is you name");
			name = input.nextLine();
			System.out.println("Good afternoon " + name);
			num++;
		}///

	}

}
