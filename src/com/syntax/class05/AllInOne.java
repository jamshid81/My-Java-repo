package com.syntax.class05;

import java.util.Scanner;

public class AllInOne {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * Write a program to ask user if there is a sale if no sale-->not going
		 * shopping if sale we will ak the price of the item based on the price we will
		 * apply discound and calculate final price
		 * 
		 * if price less than 20-->apply 10% if price between 20 and 100--> apply 20% if
		 * price between 100 and 500-->apply 30% if price more than 500--->apply 50%
		 * 
		 * After discount____ the price of the item reduced from _____to___
		 */
		String sale;
		double price;
		double discount=0;
		double finalPrice=0;
		System.out.println("Do you have sale today? ");
		sale = scan.nextLine();
		if (sale.equalsIgnoreCase("Yes")) {
			System.out.println("Whar is the price?");

			price = scan.nextDouble();
			if (price < 20) {
				discount = price * 0.10;
				finalPrice = price - discount;

			} else if (price >= 20 && price <= 100) {
				discount = price * 0.20;
				finalPrice = price - discount;
			} else if (price >= 100 && price <= 500) {

				discount = price * 0.30;
				finalPrice = price - discount;
			} else if (price > 500) {
				discount = price * 0.50;
				finalPrice = price - discount;
				
			}
			System.out.println("After the " + discount + "discount the price of the itm reduced from  " + price + " to " + finalPrice);

			
		} else {
			System.out.println("No shopping today");
		}
		
	}
}
