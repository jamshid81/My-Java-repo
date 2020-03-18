package com.syntax.class08;
import java.util.Scanner;
public class ContinueAndBreakScanner {

	public static void main(String[] args) {
		Scanner apply=new Scanner(System.in);
		
		String ok;
		
		for (int i=1; i<=10; i++) {
			System.out.println("Appley for credit Card");
			ok=apply.nextLine();
			if (ok.contentEquals("yes")) {
			System.out.println("Congratulation");{
			break;
			}
			}
		}
	}
	}


