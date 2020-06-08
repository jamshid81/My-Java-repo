package com.syntax.class27;

import java.util.ArrayList;

import java.util.Iterator;

public class Food {
	public static void main(String[] args) {
		ArrayList<String> drink = new ArrayList<>();

		drink.add("Coffee");
		drink.add("Soda");
		drink.add("beer");
		System.out.println(drink);
		for (int i=0; i<drink.size();i++) {
			if (drink.get(i).contains("e") || drink.get(i).contains("a")) {
			drink.set(i, "water");
			
			}
		
		}
		
		System.out.println(drink);
	}

}
