package com.syntax.class10;

public class ArrayTaskInClass {

	public static void main(String[] args) {
		String [] animals= {"Dog", "Caw","Goat","Tiger", "Cat", "Donkey"};
		for(int i=0; i<animals.length; i++) {
			System.out.println(i+"- "+animals[i]+", ");
			
	}
		System.out.println("========advanced loop=========");
		
	
	for (String animal:animals) {
		System.out.print(animal+" ");
	}
	}
}
