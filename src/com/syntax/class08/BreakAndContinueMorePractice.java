package com.syntax.class08;

public class BreakAndContinueMorePractice {

	public static void main(String[] args) {
		// Print numbers from 1 to 50 except those that are divisible by 3
		//Create a program that will be asking user to apply for a credit card 10 times.
		//As soon you get an “yes” from a user program should stop asking.
		for (int n=1; n<=50; n++) {
			if (n%3==0) {
				continue;
				
			}
			System.out.print(n+" ");
		}
		
	}

}
