package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogicalOperation {
	public static void main(String[] args) {
		/*
		 * take age input from a user and then based on the age print if age from
		 * 0-3->You are a baby if age from 4-5-> you are a kid if age from 6-12->you are
		 * a child if age 13-19->you are a teenager if age 20-64->you are an adult if
		 * age is mor or equals to 65-> You are sendior
		 */
		// Ctr+shit=O === the shortcut for import
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age");
		int age = scan.nextInt();
		if (age >= 0 && age < 3) {
			System.out.println("You are a baby");
		} else if (age >= 3 || age <= 5) {
			System.out.println("you are a kid");
			/*  as above sentence we can use either and(&&),
			 *  or, or (||);both work */
		} else if (age >= 6 && age <= 12) {
			System.out.println("You are a child");
		} else if (age >= 13 && age <= 19) {
			System.out.println("You are teenager");
		} else if (age >= 20 && age <= 60) {
			System.out.println("You are and adult");
		} else {
			System.out.println("You are enjoying your life");

		/* there is another way that we can do the same operation; like bellow
		 * instead of printing each line we can verify:
		 * string=human, then instead of each quat we can put human. forexample,
		 * if (age<=100 && age<=500)
		 * human=("kid")
		 */
	}
}
}