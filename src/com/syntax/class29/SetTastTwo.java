package com.syntax.class29;
//Create a Set of cities in which you want to make sure that insertion order is maintained.
//Using Iterator remove any city that starts with “A”;

import java.util.Set;
import java.util.*;
public class SetTastTwo {

	public static void main(String[] args) {
		Set<String> cities=new TreeSet<>();
		cities.add("Arlington");
		cities.add("Manassas");
		cities.add("Kabul");
		cities.add("Leesburg");
		cities.add("Qustentenia");
		System.out.println(cities);
		System.out.println("**************************************");
		Iterator<String> city =cities.iterator();
		while(city.hasNext()) {
			String c=city.next();
			if (c.startsWith("A")) {
				city.remove();
			}
			
		}
		System.out.println(cities);

	}

}
