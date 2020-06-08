package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String>lList=new LinkedList<>();
		lList.add("Ahmad");
		lList.add(0,"Mahmood");
		lList.add("Maqsood");
		lList.add("Mahmood");
		int siZe=lList.size();
		System.out.println(siZe);
		// get all elements 1 by 1 in 3 different ways
		for (int i=0; i<lList.size(); i++) {
			System.out.println(lList.get(i));
		}
		System.out.println("=============Using advanced loop============");
		for (String x:lList) {
			System.out.println(x);
		}
		System.out.println("---------------Using iterator------------------");
		Iterator<String> it= lList.iterator();
		while(it.hasNext()) {
			String str=it.next();
			System.out.println(str);
		}
	}

}
