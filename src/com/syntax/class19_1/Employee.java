package com.syntax.class19_1;

public class Employee {
	public static String company;
	protected int empNumber;
	double salary;
	private long ssn;

	void getPaid() {
		System.out.println("Employee get " + salary);
	}

	static void work() {
		System.out.println("Employee work at " + company);
	}
}
