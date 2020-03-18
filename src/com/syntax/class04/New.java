package com.syntax.class04;

import java.util.Scanner;

public class New {

	public static void main(String[] args){
	    Scanner isSunny=new Scanner(System.in);
	    System.out.println("Is it sunny today?");
	    boolean x=isSunny.nextBoolean();
	    if(x) {System.out.println("It is a sunny day, I should go somewhere!");
	    System.out.println("What is the temperature today");
	    int temp=isSunny.nextInt();
	      if (temp>85) {System.out.println("I am going to the beach!");
	      }else if (temp<85) {System.out.println("I am going to the park");
	      
	   
	
	    }else {System.out.println("I stay home and practice Java");
	   
	    }
	}

}}
