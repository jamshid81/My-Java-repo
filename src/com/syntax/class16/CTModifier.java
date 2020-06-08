package com.syntax.class16;

public class CTModifier {
//	Create a method that will accept an array as parameters and will return a sum of all elements from that array. 
//	Method should be visibly only within same package and accessible by the creating an instance of the class.
//	Create a method that will take a String as a parameter and returns reverse String.
//	Method should be available to all classes within your projects and accessible by class name.
//	Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
//	Method should be available inside the class where it was declared and executed by calling it is name.

 
	static  int num(int[] array) {
		int sum=0;

		for(int i=0; i<array.length; i++) {
				sum+=array[i];
			}
		return sum;
		
 }
public static void main(String[]args) {

	int [] array= {2,3,4,5};


	System.out.println("sum of all array is "+num(array));
}
	
}

