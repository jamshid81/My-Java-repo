package com.syntax.class05;

public class MoreLogicOperation {
	public static void main(String[] args) {
		// To compare String we use equals
		String day="Saturday";
		if (day.contentEquals("sunday") || day.contentEquals("Monday")) {
		System.out.println("Today is SDLC Class");
		
		}else if (day.equals("Saturday")|| day.contentEquals("Wednesday")){
			System.out.println("Today is Java Class");
		
		}
		
		
		
	
	}

}
