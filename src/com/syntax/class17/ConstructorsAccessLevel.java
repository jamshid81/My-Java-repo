package com.syntax.class17;

public class ConstructorsAccessLevel {

	public ConstructorsAccessLevel() {
		System.out.println("This is with public modifier");
	}

	protected ConstructorsAccessLevel(String str) {
		System.out.println("This is constructor with protected modifier " + str);
	}

	ConstructorsAccessLevel(int num) {
		System.out.println("This the constructor with default modifier=" + num);
	}

	private ConstructorsAccessLevel(String str, int num) {
		System.out.println("This is with private modifier:" + str + "&" + num);
	}

	public static void main(String[] args) {

		ConstructorsAccessLevel obj = new ConstructorsAccessLevel("Hello ", 123);
		ConstructorsAccessLevel obj1 = new ConstructorsAccessLevel();
		ConstructorsAccessLevel obj2 = new ConstructorsAccessLevel(3);
		ConstructorsAccessLevel obj3 = new ConstructorsAccessLevel("Hello friends");
//		
	}
}
