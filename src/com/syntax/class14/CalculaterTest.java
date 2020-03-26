package com.syntax.class14;

public class CalculaterTest {

	void add(int a, int b) {
		System.out.println(a+b);
	}
	void sub(int a, int b) {
		System.out.println(a-b);
	}
	void mult(int a, int b) {
		System.out.println(a*b);
	}
	void div(double a, double b) {
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		 CalculaterTest calc=new CalculaterTest();
		 calc.add(200, 100);
		 calc.sub(300, 200);
		 calc.mult(2,155);
		 calc.div(55, 22);
		 //we can add as many
		 calc.add(500, 900);
		 calc.sub(200, 300);
		 calc.mult(22,155);
		 calc.div(55, 223);
	}
	}


