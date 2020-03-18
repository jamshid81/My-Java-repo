package com.syntax.class12;

public class InClassTaskStringManiplulation {

	public static void main(String[] args) {
		int[][] a = { // 0 1 2
				{ 1, 1, 2 }, // sum = 4
				{ 3, 1, 2 }, // sum = 6
				{ 3, 5, 3 }, // sum = 11
				{ 0, 1, 2 } // sum = 3
		};
	
		int totalRow=0;
		for (int[] row:a) {
			for(int col:row) {
				totalRow=totalRow+col;
				
			}
			System.out.println(totalRow);
			totalRow=0;
		}
			for (int i=0; i<=5; i++) {
				for (int j=0; j<i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for (int k=5; k>0; k--) {
				for (int l=1; l<k; l++) {
					System.out.print("*");	
				}
				System.out.println();
			}	
	}
		}

/*
 * String day="Sunday"; char reverse = 0; for(int i=day.length()-1;i>=0;i--) {
 * reverse=day.charAt(i) ; System.out.print(reverse); } System.out.print(
 * reverse); System.out.println();
 * System.out.println("======Task-2==========="); /*Create a String and if the
 * String is not empty perform the following: if the String has an odd number of
 * characters and has 3 or more characters, print the character in the middle of
 * the String.
 * 
 * String str= "Morning"; int index=str.length(); if(!str.isEmpty()) { if
 * ((index%2!=0) && index>=3 ) { System.out.println(str.charAt(index/2)); }
 * }else { System.out.println("String is Empty");
 */
