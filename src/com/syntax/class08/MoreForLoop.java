package com.syntax.class08;

public class MoreForLoop {

	public static void main(String[] args) {
		// forloop

		for (int a = 20; a <= 50; a++) {
			System.out.println(a);
		}
		System.out.println("-------------Print Multiplication------------");
		int total = 2;
		for (int b = 1; b < 4; b++) {
			
			total = total * b;
			System.out.println(total);
		}
		System.out.println("Final total=" + total);
	}
	

}
