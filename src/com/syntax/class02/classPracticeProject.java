package com.syntax.class02;

public class classPracticeProject {

public static void main(String[] args) {
	
	String name="Ahmad";
	String lastName="Jawade";
	byte grade=12;
	String city="fairfax";
	String state="Virginia";
	int phoneNumber=571288799;
	//string must have double qoute around the assigned value; however, other veriable value not
	System.out.println(name);
	System.out.println(lastName);
	System.out.println(grade);
	System.out.println(state);
	System.out.println(phoneNumber);
	
	// we need to declare the variable once
	//ex: since i declared city once if i am to change the value i do not need to write-
	// (String city=city name), insteat i simply mention (city=city name)
	
	grade=6;
	state="louisina";
	phoneNumber=703564234;
	System.out.println(grade);
	System.out.println(state);
	System.out.println(phoneNumber);
	
	System.out.println("My name is "+name+" My last name is "+lastName+" I live in the city of "+city+" in state of "+ state+" and my number is "+phoneNumber+"."
			
			
			
	);
	
	
	
	
}
}
