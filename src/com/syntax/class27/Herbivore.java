package com.syntax.class27;
 abstract class Herbivore {

int amount = 10;
static String food= "grass";
public static void eatGrass() {
	System.out.println("Herbivore eats "+food);
}
public abstract void drinkWater ();

public int chew(int t) {
return t;

}
}
class Animal extends Herbivore{
	public void drinkWater() {
		System.out.println("Herbivore drinks water  "+ amount+" times everyday ");
	}
	
}
