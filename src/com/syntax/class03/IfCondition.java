package com.syntax.class03;

public class IfCondition {

	public static void main(String[] args) {

		System.out.println("Start coding");

		int num = 178;
		if (num > 100) {

		}
		System.out.println("My number is Large");

		System.out.println("En of the program");

		System.out.println("-----------------------------");

		int expectedHours = 15;
		int actualHours = 4;
		// if actual is more than expected the consol it will be printed "you will lobe
		// java"
		// if the condition is not matched it will not print anything
		if (actualHours >= expectedHours) {

			System.out.println("You will love Java");

		} else {// otherwise (if false)--->go inside else block

			System.out.println("You will not like Java");
		}
		System.out.println("----------------------------");
		double budget=100000;
		double carprice=12000;
		
		if(budget>carprice) {
			
			System.out.println("I will buy this car");
			}else {
			
		
		System.out.println("I will not buy this car today" + "I will bo learn Java" );


	}
		//the below line doesnt belong to the if condition, or else;therefore, it will be
		// printed
		System.out.println("I am code after if condition");

}
}
