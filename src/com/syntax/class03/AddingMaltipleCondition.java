package com.syntax.class03;

public class AddingMaltipleCondition {

	public static void main(String[] args) {
		int day=6;
		if(day==1) {
			System.out.println("It is Monday, no class today");
		}else if(day==2) {System.out.println("It is Tuesday, we have SDLC class");
		
		}else if(day==3) {System.out.println("It is Wednesday, we have SDLC class");
	}else if(day==4) {System.out.println("It is Thursday, we have Review");
	
	}else if(day==5) {System.out.println("It is friday, we dont have class");
	
	}else if(day==6) {System.out.println("It is Saturday and we have Java class");
	//system excute from top to dottom
	}else if(day==7) {System.out.println("It is Sunday, we have Java");
	}else {System.out.println("Invalid day");}
	}
}
