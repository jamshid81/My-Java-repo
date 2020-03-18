package com.syntax.class04;

public class NestedfElse {
	public static void main(String[]args) {
		boolean quizComleted=true;
		int score=98;
		if(quizComleted) {
			System.out.println("Lets check you scor");
			if(score>90) {
				System.out.println("Great job!");
			}else if(score>80) {
				System.out.println("Welldone!");
			}else if(score>70) {System.out.println("You could have better");}else {
				System.out.println("You failed");
			}
		}else {System.out.println("Please do you HW");}
	
		boolean userHasDiploma=true;
		double gpa=3.5;
		if (userHasDiploma) {System.out.println("Congratulations");
		if (gpa>=3.5) {System.out.println("You are eligible for scholarship");}else {
			System.out.println("You should have studied harder");}
		}
		
		double mortgageRate=4.6;
		int mortgagePrice=1500000;
		if (mortgageRate>4.5) {
			System.out.println("User will not buy a house");
		}else {System.out.println("User will consider bying ");}
		if (mortgagePrice>2000000) {System.out.println("User will take a loan");
		
	}else {System.out.println("User will pay cash");}
	
	}
	
	
}
