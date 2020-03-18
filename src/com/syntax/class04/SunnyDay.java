package com.syntax.class04;

import java.util.Scanner;

class SunnyDay {
	
	public static void main(String[]args){
		Scanner isSunny=new Scanner(System.in);
	  System.out.println("Is it sunny outside?");
	  boolean x=isSunny.nextBoolean();
	 
	  if(x){System.out.println("It is a sunny day, I should go somewhere");
	   System.out.println("what is the temprature outside?");
	   int temp=isSunny.nextInt();
	  if (temp>85) {System.out.println("I am going to the beach!");
	  }else{System.out.println("I am going to the park");
	  }
	  
	  }else{System.out.println("I stay home and practice Java");}
	  
	}
	}
	
	
