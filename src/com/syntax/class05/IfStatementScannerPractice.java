package com.syntax.class05;

import java.util.Scanner;

public class IfStatementScannerPractice {

	public static void main(String[] args) {
Scanner height=new Scanner(System.in);
System.out.println("Please enter your height in inches");
int h=height.nextInt();
if (h<60) {System.out.println("Short");

}else if (h>=60 && h<=72) {System.out.println("Medium");
}else {System.out.println("Tall");
}

}
}