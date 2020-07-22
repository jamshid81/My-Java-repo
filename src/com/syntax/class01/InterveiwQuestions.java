package com.syntax.class01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InterveiwQuestions {
	
	public static void main(String[] args) {
		
		//Given a list of people’s names “Ahmed”,“John”,“Eric” , write a  java operation to remove all the names named “Ahmed”

		String[] names = { "Ahmed", "John", "Eric", "Ahmed", "Rohani" };
		/**
		 * changing array into List
		 */
		List<String> arraylist = Arrays.asList(names);
		/**
		 * import the list to set to element the duplicate 
		 */
		Set<String> setList = new HashSet<>(arraylist);
		/**
		 * remove the specific String
		 */
		setList.remove("Ahmed");
		/**
		 * and print out
		 */
		System.out.println(setList);
		
		//Given a list of integers 1,2,3,4,5,6,7 etc. remove all values greater than 100

		System.out.println("----------------secound questions---------------");

		int[] numArray = { 1, 4, 76, 354, 134, 76, 45 };

		ArrayList<Integer> listOFNums = new ArrayList<>();

		for (int num : numArray) {
			if (num <= 100) {
				listOFNums.add(num);
			}

		}
		System.out.println(listOFNums);

	}
}
