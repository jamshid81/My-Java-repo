package com.syntax.class13;

//once we creat the class we verify the variables inside the class outside the main method
public class Car {
	String make;
	String modle;
	String color;
	int year;
	void drive() {
		System.out.println("the car drives");
		System.out.println(make + " drives very well");
	}

	void speed() {
		System.out.println("the car speeds");
		System.out.println(make + " speeds rapitly");
	}

	void upgrate() {
		System.out.println("the car can be upgrated");
		System.out.println(make + modle + " can be upgrated every year");
	}

	public static void main(String[] args) {
		// we creat the object/instance of the class that object will have access to all
		// variables
		// and method from that class;(this will be inside the main method)
		Car car1 = new Car();// this access the specification from the class;
		// must be outside of the main method
		//*first specification
		car1.make = "BMW";
		car1.modle = "Q5";
		car1.color = "black";
		car1.year = 2020;
		//we can add as many cars just we have to access it using "new Car"
		// second behaviors
		car1.drive();
		car1.speed();
		car1.upgrate();
	}
// now the void method will access the behavior form the class
// * just to make sure that it must be outside of the main method
	
}
