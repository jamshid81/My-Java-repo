package com.syntax.class12;

public class SplitFunctionString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java is my favorite class";
		String [] array=str.split("my");
		System.out.println(array.length);
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		String str1="Java is my favorite class";
		String [] array1=str1.split("a");
		for(String ar:array1) {
			System.out.print(ar+",");
		}
		System.out.println("============Task2==========");
		String str2="Java is my Favorite Class";
		String [] array2=str2.split(" ");
		for (int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
			System.out.println("=============AddvancedLoopWay=======");
			for(String ar2:array2) {
				System.out.println(ar2);
			}
			
		}
		
	}

}
