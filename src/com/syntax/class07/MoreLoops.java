package com.syntax.class07;

public class MoreLoops {

	public static void main(String[] args) {
		String num [][]= {
				{"afghansitan", "iran", "india"},
				{"england", "germany", "itlay"},
				{"maxico","indoruos","guatimala"}
				};
		
		for(String [] row:num) {
			for(String col:row) {
				
				System.out.print(col+" ");
				
			}
			System.out.println();
		}
			

	}

}
