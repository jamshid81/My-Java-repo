package com.syntax.class11;

public class TwoDArrayRecap {

	public static void main(String[] args) {
		String [][] groceries= {
				{"Bananna", "carrot", "orange",},
				{"graps","apple","mango","kiwi"},
				{"pinapple","limon","almont","blueberry"}	
		};
		for (int r=0; r<groceries.length; r++) {
			for (int c=0; c<groceries[r].length; c++) {
				System.out.print(groceries[r][c]+" ");
			}
			System.out.println();
		}
		System.out.println("===============");
	}

}
