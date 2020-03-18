package com.syntax.class05;

import java.util.Scanner;

class Hw3 {
	public static void main(String[]args){
	Scanner user;
	user=new Scanner(System.in);
	System.out.println("Do you need a loan?");
	boolean loan;
	loan=user.nextBoolean();
	String eligibility;
	eligibility=user.nextLine();
	if (loan) {
		System.out.println("Please enter your creditScore");
		int creditScore;
		creditScore=user.nextInt();
		if (creditScore<600 ) {
			eligibility=("NOt eligible");
			
		}else if (creditScore>=600 && creditScore<700) {
			eligibility=("Maybe eligible");
		}else if (creditScore>700 && creditScore<800) {
			eligibility=("Eligible");
		}else if (creditScore>=800) {
			
			eligibility=("Definity eligible");
		}
		System.out.println("Eligibility is "+ eligibility );
	}else {System.out.println("your are not eligible");}
	
	
	}   
	
}
		
	 /* Scanner dNumber=new Scanner(System.in);
	 * System.out.println("Please enter 3 disticnt numbers"); int x, y, z;
	 * x=dNumber.nextInt(); y=dNumber.nextInt(); z=dNumber.nextInt(); int largest=0;
	 * if(x>y && x>z){ largest=x; else if (y>x && y>z){ largest=y; }else if (z>x &&
	 * z>y){ largest= z; } } System.out.println("The largest number is "+largest);
	 * 
	 * } }
	 * 
	 */
