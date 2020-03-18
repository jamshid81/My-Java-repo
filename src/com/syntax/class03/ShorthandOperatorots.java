package com.syntax.class03;

public class ShorthandOperatorots {

	public static void main(String[] args) {
		int num=200;
		num=num+300;
		
		System.out.println(num);
		num-=100;// (num=num-100), this is the shorthand type of assigning
	
		System.out.println(num);
		num/=7;//num=num/7;
		System.out.println(num);
		num*=5;// is another way of writing "num=num*5";
		System.out.println(num);
		// the system is done from left to right and top to bottom 
		//the math operation is done on the remaining of the previous value
		int num4=12;
		int num5=12;
		
		num4*=4;// num4=num4*4
		num5/=6;// num5=num5/num4
		System.out.println(num4);
		System.out.println(num5);

	}

}
