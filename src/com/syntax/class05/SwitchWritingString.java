package com.syntax.class05;

import java.util.Scanner;

public class SwitchWritingString {

	public static void main(String[] args) {

		Scanner scan;
		String country;
		String favoriteFood=null;
		scan = new Scanner(System.in);
		System.out.println("Please name of instructor");
		country = scan.next();
		switch (country.toLowerCase()) {
		// if we want the system to accept the lower or upper case litters we need to add .toLower/uppercase
		case "tajikstan":
			favoriteFood = "Osh";
			break;
		case "afghanistan":
			favoriteFood = "Palaw";
			break;
		case "turkey":
			favoriteFood = "Baklava";
			break;
			default:
				favoriteFood="Unknown";
		}
		System.out.println("Your favorite food is " + favoriteFood);

	}

}
