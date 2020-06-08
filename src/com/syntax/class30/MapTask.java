package com.syntax.class30;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTask {
public static void main(String[] args) {
	Map <String, String> count=new HashMap<>();
	count.put("Afghanistan", "Kabul");
	count.put("USA", "Washington DC");
	count.put("Turkey", "Istanbol");
	count.put("Russia", "Moscaw");
	count.put("Iran", "Tehran");
	count.put("India", "New Dehli");
	System.out.println(count);
	Set<String> a=count.keySet();
	for (String country:a) {
		System.out.println("Enterd Countries are:"+country);
		for (String capital:count.values()) {
			System.out.println("The capitals of the above countries are :"+capital);
		}
		Iterator<String> it=count.keySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
}
