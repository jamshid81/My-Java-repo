package com.syntax.class30;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ClassTaskTwoMap {
	public static void main(String[] args) {

		Map<Integer, String> bestbuy = new LinkedHashMap<>();
		bestbuy.put(2324343, "Computer");
		bestbuy.put(4534323, "Printer");
		bestbuy.put(343435343, "Ipod");
		bestbuy.put(3434343, "TV");
		System.out.println(bestbuy);
		System.out.println(bestbuy.size());
		

		Set<Entry<Integer, String>> bestBuy = bestbuy.entrySet();
		System.out.println(bestBuy);
		for (Entry<Integer, String> bB : bestBuy) {
			int key = bB.getKey();
			String item = bB.getValue();
			System.out.println(item + " ID is:" + key);
		}
	}
}