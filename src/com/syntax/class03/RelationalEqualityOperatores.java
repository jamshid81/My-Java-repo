package com.syntax.class03;

public class RelationalEqualityOperatores {

	public static void main(String[] args) {
		int i=10;
		int y=20;
		
		System.out.println(i>y);//the answer will be false in the console
		System.out.println(i<y);//the answer will be true
		System.out.println(i==y);//to find if the intigers are equal we
		//we use two equal sign (==)the answer will be false
		System.out.println(i!=y);// to find out if the intergers are not equal
		// other way of doing the above operation is to assign the result to varialbe
		
		double a=900.00;
		double b=100.99;
		 // make sure to specify the correct data type
		boolean result=a>b;//true
		boolean result1=a==b;// false
		boolean result2=a!=b;//true
		// the reason whey why declare boolean is becaous the result is boolean
		System.out.println(result);
		
		int neda=12;
		int yasra=10;
		int hamza=5;
		boolean resulta=neda>yasra;
		boolean resultb=yasra>hamza;
		boolean resultc=hamza==neda;
		System.out.println(resulta);
		System.out.println(resultb);
		System.out.println(resultc);
		

	}

}
