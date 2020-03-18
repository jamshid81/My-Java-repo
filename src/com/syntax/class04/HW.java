package com.syntax.class04;
import java.util.Scanner;

public class HW {
	public static void main(String[]args) {
		Scanner scan1=new Scanner(System.in);
		System.out.println("Enter Your age");
		int age=scan1.nextInt();
		age+=10;
		System.out.println("Your age after 10 years is "+age);
	}

}
