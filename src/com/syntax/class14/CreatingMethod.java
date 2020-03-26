package com.syntax.class14;

public class CreatingMethod {
	// we want to create a method that will accept grades(90, 80)
		// based on the marks it will return grade(A, B, C)
		// if grade > 90--> A, if 90<grade>80 --> B, if 80<grade>70 --> C
	char getGrade(int a) {
		char grade;
		if (a >= 90) {
			grade = 'A';
		} else if (a < 90 && a > 80) {
			grade = 'B';
		} else if (a < 80 && a > 70) {
			grade = 'C';

		} else {
			grade = 'F';
		}
		return grade;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreatingMethod obj = new CreatingMethod();
		char g = obj.getGrade(89);//this is one way
		System.out.println(g);
		System.out.println(obj.getGrade(95));// is another way of return
		//adding if condition
		if (g=='A' || g=='B') {
			System.out.println("Great Job!");
		}else {
			System.out.println("Study more");
		}
	}
}
