package com.syntax.class08;

public class BreakAndContinue {

	public static void main(String[] args) {
		// once i=4----> we want to stop the loop

		for (int i = 1; i < 10; i++) {
			if (i == 4) {
				System.out.println("I am stoping the Loop");
				break;//if we remove the break it will print the code until the meet the condition (1<10)
			}
			System.out.print("I am inside the loop");
			System.out.print(i+" ");
		}
		System.out.println("I am outside the loop");
		System.out.println("--------Continue-------");
	
		for (int i = 1; i < 10; i++) {
			if (i == 4 ||i==5|| i==6) {//if integer equals to these number the continue will skip the itration
				continue;//we use continue to skip variable
				
	}
			System.out.print(i+" ");
		}
		//write a program that print numbers from 1 to 100, but do not print (skip) 35 to 55
		for (int i=1; i<=100; i++) {
			if (i>=35 && i<=55) {
				continue;
			}
			System.out.println(i+" ");
		}
}
}