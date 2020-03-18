package com.syntax.class09;

public class ClockAndMilageLoop {

	public static void main(String[] args) {
		for (int h=0; h<24; h++) {
			for (int m=0; m<60; m++) {
				
				if (m<10) {
				System.out.println(h+":0"+m);
				}else {
					System.out.println(h+":"+m);}
				}
				
		}
		System.out.println("==========CarMilage===========");
		 for (int k=0; k<10; k++) {
			 for (int d=0; d<10;d++) {
				 for (int m=0; m<10; m++) {
					 for(int mm=0; mm<10; mm++ ) {
						 System.out.println(k+""+d+""+m+""+mm);//if drop the space null, the console will 
					 }///										add the value instead of concatinate
				 }
			 }
		 }

	}

}
