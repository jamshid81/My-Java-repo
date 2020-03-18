package com.syntax.class03;

public class CompareNumbers {
	public static void main(String[] args) {
		double numberOne = 10;
		double numberTwo = 10;
		if (numberOne > numberTwo) {
			System.out.println("numberOne is larger than numberTwo");
			// if we are to add more condition we can simply add it by "else if"
		} else if (numberOne < numberTwo) {

			System.out.println("numberOne is smaller than numberTwo");
		} else {
			System.out.println("numberOne is equal to numberTwo");

		}
	}

}
