package com.syntax.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {

		int num1 = 8;
		int num2 = 6;
		double num3 = 12.99;
		double num4 = 22.455;
		// excersize number 1
		double sum1 = num3 + num4;
		int sum = num1 + num2;
		int sub = num1 - num2;

		double sume = num3 + num4;

		int mult = num1 * num2;
		int div = num1 / num2;

		System.out.println("the result of addition is " + sum + ".");
		// press ctr+shift+f will format and organize out code

		double s = 3.9;
		double s2 = s * s;

		System.out.println("the squire of the " + s + "is" + s2);

		// excercise 3
		int width = 5;
		int height = 8;
		int area = (width * height);
		int perimeter = 2 * (width + height);
		System.out.println(area);

		System.out.println("The perimeter of a rectangle with width " + width + " and height " + height
				+ " is equal to " + perimeter);
		
		// if we want a math operation to be done we must put the operation inside
		//in an additional prentecis. look at the example below
		
		System.out.println("the result of the addition is " + (num1+num2));
		
		int num=10+10*10;
		System.out.println(num);
		
		int sum2=(10+10)*10;
		
		System.out.println(sum2);
		

	}

}
