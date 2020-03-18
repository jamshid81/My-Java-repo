package com.syntax.class11;

public class Task2TwoDArray {

	public static void main(String[] args) {
		String [][] countries= {
				{"USA","Maxico","Canada"},
				{"Alsavador","Bolivia","Brazil"},
				{"Afghanistan","Japan","Chaina","Russia"},
				{"England","Germany","France","Itaia"}

		};
		int sum=0;
		for (int r=0; r<countries.length; r++) {
			for (int c=0; c<countries[r].length; c++ ) {
			System.out.print(countries[r][c]+" ");
			sum+=1;
			}
			System.out.println(" ");
			
		}
		System.out.println(sum);
		int sum1=0;
		System.out.println("========Another Way======");
		for (String[] name :countries) {
			for (String country:name) {
				System.out.print(country+" ");
				
					sum1+=1;	
			}
			System.out.println();
			
		}
		System.out.println(sum1);

	}

}
