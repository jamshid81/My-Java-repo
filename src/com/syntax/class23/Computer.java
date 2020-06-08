package com.syntax.class23;

public class Computer {
	String make;

	public Computer(String make) {
		this.make = make;

	}

	void display() {
		System.out.println(make + " are built with advanced technology packages");
	}

	void hightech() {
		System.out.println(make + " have fingerprint option");
	}
}

class Apple extends Computer {
	public Apple(String make) {
		super(make);

	}

	void hightech() {
		System.out.println(make + " have face recognition ");
	}
}

class Lenovo extends Computer {
	public Lenovo(String make) {
		super(make);

	}

	void hightech() {
		System.out.println(make + " are very thin and has tauchscreen option");
	}
}

class HP extends Computer {
	public HP(String make) {
		super(make);
	}

	void hightech() {
		System.out.println(make + " have all the above options");
	}
}
class Dell extends Computer{
	Dell(String make){
		super(make);
	}
	void hightech() {
		System.out.println(make+" are the worst of all");
}
}