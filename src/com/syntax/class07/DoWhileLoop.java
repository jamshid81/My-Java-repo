package com.syntax.class07;

public class DoWhileLoop {

	public static void main(String[] args) {
		// while vs do while
		// while check the condition then execute; however, do while execute first then
		// check the condition
		int num = 1;
		while (num >= 5) {
			System.out.println("Hello" + " ");
			num++;
		}
		System.out.println("____Using Do While Loop___");
		// do while execute first then check the condition
		int num1 = 1;
		do {
			System.out.println("Hello" + " ");
			num1++;
		} while (num1 >= 5);
		// * while has more usage then the do while loop
	}
}
