package com.syntax.class05;

import java.util.Scanner;

public class CompareTwoNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number");
		int num1 = scan.nextInt();
		System.out.println("please enter secount number");
		int num2 = scan.nextInt();
		System.out.println("please enter third number");
		int num3 = scan.nextInt();
		
		int largest;
		largest=0;
		if (num1 > num2) {
			largest = num1;
			if (num1>num3) {
				largest=num1;	
			}else { largest=num2;}	
}
		System.out.println(largest+" is"+" the second number");
	}
	}

