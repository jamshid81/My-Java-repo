package com.syntax.class09;

public class MoreOnPattern {

	public static void main(String[] args) {
		for (int r = 1; r <= 5; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=======Printing Numbers=========");
		for (int e=1; e<=5; e++) {
			for (int d=1; d<=e; d++) {
				System.out.print(d+" ");//if we want to print like 1,22,33,44 we print the e instead of d
			}
			System.out.println();
		}
		for (int e=1; e<=5; e++) {
			for (int d=1; d<=e; d++) {
				System.out.print(e+" ");//if we want to print like 1,22,33,44 we print the e instead of d
			}
			System.out.println();
	}
	}
}
