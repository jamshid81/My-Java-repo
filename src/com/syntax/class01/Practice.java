package com.syntax.class01;

public class Practice {
	
	public static void main (String[] args) {
		// creating variable to store numeric primitives of whole numbers 
		byte a=100;
		short b=1000;
		int c= 100000;
		long d=10000000;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	// creating variable to store primitives of decimail numbers	
		float a1=10.45f;
		double a2=10.456789;
		System.out.println(a1);
		System.out.println(a2);
		
		//creating variable to store non numeric primitives of char
		
		char a11='J';
		char a12='$';
		
		System.out.println(a11);
		System.out.println(a12);
		//creating a variable to store boolean true/false
		boolean a111=true;
		boolean a112=false;
		System.out.println(a111);
		System.out.println(a112);
		
	//creating a varial to store String (multiple character)
		
		String name="Ahmad Jamshid Salih ";
		String address="7673 Staunton Cir ";
		String city="manassas";
		String state="Virginia";
		// the space matters inside the double quat
		// if there is two string which are the same but one has space and the other doesent
		//-that means that they are not the same.
		
		System.out.println(name);
		System.out.println(address );
		System.out.println(city );
		System.out.println(state);
		
		System.out.println("My name is "+name);
		System.out.println("My address is "+address);
		System.out.println("My city is "+city);
		System.out.println("and My State is "+state);
		
		
	System.out.println(name+address+city+state);
	
	boolean isTrue;
	isTrue=true;
	System.out.println(isTrue);
	
		
	}

}
