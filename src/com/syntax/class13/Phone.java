package com.syntax.class13;

public class Phone {
//in here we are specifying our data type, it has to be within the class, but out of main
	String product;
	String brand;
	double size;
	int year;

	// in here we are creating methods of behavior, has to be within the class, but out of main method
	void function() {
		System.out.println(product + " has many new functions and its brand is " + brand);
	}

	void camra() {
		System.out.println(brand + "'s camra is 25MGP");
	}

	void softwareVersian() {
		System.out.println(brand + " software versian is os 14");
	}

	void additionalOptions() {
		System.out.println(product + " has many additional option than previous modle");
	}

	public static void main(String[] args) {
		// we are creating an object here
		Phone iphone = new Phone();
		iphone.product = "apple";
		iphone.size = 6.6;
		iphone.brand = "iphone 11 pro";
		iphone.year = 2020;
		// iphone behavior
		iphone.function();
		iphone.camra();
		iphone.softwareVersian();
		iphone.additionalOptions();
		// creating object here
		Phone glaxy = new Phone();
		glaxy.product = "Samsung";
		glaxy.size = 6.7;
		glaxy.year = 2020;
		glaxy.brand = "S12";

		// assignig behavior

		glaxy.function();
		glaxy.camra();
		glaxy.softwareVersian();
		glaxy.additionalOptions();

	}

}
