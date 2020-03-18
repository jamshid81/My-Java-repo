package com.syntax.class08;
import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		/*
		 * 1.Write a program that reads a range of integers (start and end point),
		 *  provided by a user and then from that range prints the sum of the even and odd integers.
		 *2. Write a program to ask a user to enter item they want to buy and the price of that item.
		 * Every time user enters money accumulate the amount and tell the user how much is left to pay off the amount.
		 *  If user give more money program should return a change.
		 *   Whenever a user done with payments program should say “Thank you for shopping!”
		 */
		Scanner scan=new Scanner(System.in);
		int evensSum=0;
		int oddsSum=0;
			System.out.println("please enter a number between 1 and 20");
			int n;
			int n1;
			n=scan.nextInt();
			n1=scan.nextInt();
			for (int x=n; x<=n1; x++) {
				if (x % 2==0) {
					evensSum=evensSum+x;
				}else {
					oddsSum=oddsSum+x;
			}
			
		}	
			System.out.println("The total of even numbers between "+n+" and "+n1+" equals "+evensSum);
			System.out.println("Teh total of odd numbers between "+n+" and "+n1+" equals "+oddsSum);
	}

	}
