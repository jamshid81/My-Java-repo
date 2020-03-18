package com.syntax.class10;

public class AdvanceForLoopIntro {

	public static void main(String[] args) {
		char[] grade = { 'A', 'B', 'C', 'D', 'E', 'F' };
		for (int i = 0; i < grade.length; i++) {
			System.out.println(grade[i] + " ");
		}
		System.out.println();
		System.out.println("===============Pringting using advance/enhance for loop==================");
		String[] fruits = { "Bannana", "Kiwi", "Apple", "Mango" };
		// advanced for loop, enhanced for loop, for each loop= (Type any"Name":variable"Name")
		for (String fruit : fruits) {
			if (fruit.equals("Apple")) {// , or we can type (fruit.equals(fruits[N]))
				System.out.println(fruit + " is your favorite fruite");
			} else {

				System.out.println(fruit);
			}
		}
		System.out.println("++++++++++++++++++++");
		// reular for loop
		// fruits.lenght=number of element
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
	}
}
