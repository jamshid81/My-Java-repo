package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

//Create an arraylist of cars and retrieve all the values using 3 different ways.
//Create an arrayList of words. Remove every word that ends with “e”. Use iterator
public class Task {
public static void main(String[] args) {
	ArrayList <String > cars=new ArrayList<>();
	cars.add("Acura");
	cars.add("Leuxis");
	cars.add("Honda");
	cars.add("Toyota");
	cars.add("BMW");
	System.out.println(cars);
	System.out.println(cars.size());
	
	ArrayList<String> words=new ArrayList();
	words.add("Afghanistan");
	words.add("Jason");
	words.add("Louren");
	words.add("awake");
	Iterator<String> a=words.iterator();
	while(a.hasNext()) {
		if (a.next().endsWith("e")) {
			a.remove();
		}
	}
	System.out.println(words);
}
}
		
		
	
	
	