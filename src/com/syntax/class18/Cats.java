package com.syntax.class18;

public class Cats extends Animals  {
String breed;
public void scratch() {
	System.out.println("Additionally, this enimal scratch");
}
public void catSpecification() {
	System.out.println("This cat is "+color+" "+size+" and it is an  "+breed);
}
public static void main(String[] args) {
	Cats cat=new Cats();
	cat.bark();
	cat.beWild();
	cat.fur="any";
	cat.color="white";
	cat.size="Big";
	cat.breed="Afghan cat";
	cat.scratch();
	cat.catSpecification();
	
}
}
