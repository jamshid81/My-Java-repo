package com.syntax.class08;

public class NestedLoop {
	public static void main(String[] args) {
		
		System.out.println("The multiplication of numbers from 1-9 are: ");
		for (int x=1; x<=9;x++) {
			for (int y=1; y<=10;y++) {
				System.out.print(y*x+", ");
			}
			System.out.println();
		}
		
	}
}


