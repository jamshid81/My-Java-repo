package com.syntax.class04;

public class NestedF1 {
	public static void main(String[] args) {

		boolean allergy = true;
		boolean appleAllergy = true;
		boolean orangeAllergy = true;
		boolean kiwiAllergy = false;
		if (allergy) {
			System.out.println("Please answer bellwo");
			if (orangeAllergy) {
				System.out.println("Do not eat oranges");
				if(appleAllergy) {System.out.println("Do not eat Apple");
				if(kiwiAllergy) {System.out.println("Do not eat Kiwi");}
				}
			} else {System.out.println(" You do not have allergy");}
		}

	}
}
