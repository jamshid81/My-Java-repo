package com.syntax.class08;

public class ForLoopPractice {

	public static void main(String[] args) {
		////write a program to calculate sum of odds and sum of even number from 1 to 99
		
		int evensSum=0;
		int oddsSum=0;
		for (int a=1; a<=99; a++) {
			if (a%2==0) {
				evensSum=evensSum+a;
			}else {
				oddsSum=oddsSum+a;
			}
			
		}
		System.out.println(" Sum of evens= "+ evensSum);
		System.out.println(" Sum of odds= "+ oddsSum);
	}

}
