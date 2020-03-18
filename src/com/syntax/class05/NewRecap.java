package com.syntax.class05;

import java.util.Scanner;

public class NewRecap {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your birth month ");
		String month = scan.nextLine();
		String season;
		if (month.equalsIgnoreCase("January") || month.equals("February") || month.equals("March")) {
			season = "Winter";

		} else if (month.equals("April") || month.equals("May") || month.equals("Jun")) {
			season="Spring";
		}else if (month.equals("July") || month.equals("August") || month.equals("September")) {
			season="Summer";
	}else{ season="fall";}
	{System.out.println("You birht month is in "+season);
	}
}
}
