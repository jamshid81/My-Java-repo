package com.syntax.class01;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		if (n%2!=0) {
			System.out.println("Wierd");
		}else if (n%2==0 && n>2 && n<5) {
			System.out.println("Not Wierd");
		}

	}

}
