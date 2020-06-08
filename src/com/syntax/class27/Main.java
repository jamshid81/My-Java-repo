package com.syntax.class27;

public class Main {

	public static void main(String[] args) {
		
		Herbivore obj=new Animal();
		obj.chew(13);
		Herbivore.eatGrass();
		obj.drinkWater();
		System.out.println("Hernivors chew food "+obj.chew(13)+" times");
	}

}
