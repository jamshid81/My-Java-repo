package com.syntax.class04;

public class NestedF {
	// In Java "nested means to have condition inside condition
	// both of the f-statements needs to be inside the same black of {}
	public static void main(String[] args) {
		boolean classToday = true;
		boolean flag = false;
		if (flag) {// typting if (flg) means "if flag is true"
			System.out.println("Hello");
			if (classToday) {// if(classToday)=if classToday is true
				System.out.println("Hello Friends");
			} else {
				System.out.println("Hello family");
			}
		} else {
			System.out.println("Bye");
		}
		System.out.println("I am out of condition ");

		boolean isFriday = true;
		int date = 14;
		if (isFriday) {
			System.out.println("I am going to wath a movie");
			if (date == 13) {
				System.out.println("It will be Harror");
			} else {
				System.out.println("Although it is friday,It will be an action");	}
		}
		

	}

}
