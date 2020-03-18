package com.syntax.class10;

public class MoreOnTowDimentionalArray {

	public static void main(String[] args) {
		String [][]month= {
				{"January", "February","March"},
				{"April","May","June",},
				{"July","August","September",},
				{"October", "November", "December"}
		};
		System.out.println(month[1][2]);
		System.out.println("However, the first month of the year is "+ month[0][0]);

	}
}
