package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		// declare an array and initialize it:
		int [] array=new int[4];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		System.out.println(array[1]);	
		//there are two ways to initialize variable:
		String[]carArray;// one way
		String carArray1[];//another way
		carArray=new String[3];
		carArray[0]="BMW";
		carArray[1]="Honda";
		carArray[2]="Toyota";
		System.out.println("I am driving "+ carArray[2]);
		int [] number=new int[3];
		number[0]=100;
		number[1]=200;
		number[2]=300;
		//we can change the value of the arrays anytime
		number[1]=2000;
		System.out.println(number[1]+number[0]);
		
		
		int [] num={1,2,3,4,5};
		  for (int i=0; i<num.length; i++);
		  int i=0;
		  System.out.println(num [i]);
		

	}

}
