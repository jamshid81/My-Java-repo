package com.syntax.class02;

public class ModulusOperator {

	public static void main(String[] args) {

		float f = 12.50f;
		float f1 = 2.7f;

		float result = f / f1;

		System.out.println(result);

		int i = 12;
		int y = 7;
		// because of the data type even if the result is decimal number it will not
		// show the
		// the decimal point number; example bellow

		int result1 = i / y;

		System.out.println(result1);
		// if we change the result data type we will find the decimail number;
		// however, that will be 0. therefore, we must use the float or double when
		// assigning
		// like float i=12 float y=7
		double result2 = i / y;
		System.out.println(result2);

		// we use modulus to find the remainder

		int v = 16;
		int w = 7;
		int mod = v % w;
		System.out.println(mod);
		
		//it is not possible to store decimail into int but we can store whole number to double
	System.out.println(result2);
	}
	

}
