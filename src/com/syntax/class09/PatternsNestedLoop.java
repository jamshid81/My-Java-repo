package com.syntax.class09;

public class PatternsNestedLoop {

	public static void main(String[] args) {
		for (int r=1; r<=5; r++) {
			for(int c=1; c<=5; c++) {
				System.out.print("*");
			}
			System.out.println(); 
		}
		System.out.println("=======Pattern2=======Printing 5x10======");
		for(int a=1; a<=5; a++) {
			for (int b=1; b<=4; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=======PrintingNumbersInsteadOFStars========");
		for(int i=1; i<5; i++) {
			for (int j=1; j<=5; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("======PrintingPatern 5 line of 1-9======");
		for (int e=1; e<=5; e++) {
			for (int f=1; f<=9; f++) {
				System.out.print(f+" ");
			}
			System.out.println();
		}
	}

}
