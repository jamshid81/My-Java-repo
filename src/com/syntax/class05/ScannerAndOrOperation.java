package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndOrOperation {
	public static void main(String[] args) {

Scanner day=new Scanner(System.in);
System.out.println("Is it weekend of weekday?");
int wDay=day.nextInt();
if (wDay>=1 && wDay<=5) {System.out.println("It is weekday");
}else if (wDay==6 || wDay==7) {System.out.println("It is weekend");
	}else{System.out.println(" Invalid Day");
}
}
}