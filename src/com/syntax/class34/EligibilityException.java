package com.syntax.class34;

public class EligibilityException {
	
	public static void main(String[] args) {
		ageEligibility(14); 

	}
	public static void ageEligibility(int age) {
		if (age<16) {
			
			throw new  RuntimeException("Not eligible to aquire the driving listence");
			
		}
		System.out.println();
	}

}
