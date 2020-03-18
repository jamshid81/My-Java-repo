package com.syntax.class09;

public class StringStoringArrays {

	public static void main(String[] args) {
		// creating an array and store names of out classes
		String[]syntaxClasses= {"SDLC","Nanual Testing", "Java ","GIT"};
		//Today we have Java Class
		System.out.println("Today we have "+syntaxClasses[2]+" Class");
		
		double [] numbers= {22.99, 67.99, 400, 99090};// if initialize and then assign, it doesnt work
		//like if we say double[]numbers;
		// numbers={}------>the compiler does not wrok
		System.out.println(numbers[0]);
		//we 
		String []school= {"Math", "Geometry","Physics","Biology"};
		System.out.println(school[3]);
		System.out.println(school.length);
	}

}
