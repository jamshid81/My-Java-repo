package com.syntax.class29;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
//Create a Set collection in which you need to add names of the countries. 
//In this set we want all objects to be sorted in alphabetical order.
//Using 2 different ways retrieve all elements from set.

public class Country {
public static void main(String[] args) {
	Set<String> countries=new TreeSet<>();
	countries.add("Afghanistan");
	countries.add("USA");
	countries.add("Canada");
	countries.add("Chaina");
	countries.add("Russia");
	countries.add("Turkey");
	System.out.println(countries);
	System.out.println("---------------------------------------------");
	
	Iterator<String> c	=countries.iterator();
	while(c.hasNext()) {
		System.out.println(c.next());
	}
	System.out.println("=============================================");
	for (String ca:countries) {
		System.out.println(ca);
	}

	
	
}
	
}
