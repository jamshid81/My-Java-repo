package com.syntax.class12;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------substring() FUNCTION-------");
		String str = "Today is a rainy day";
		String partialString = str.substring(6);//start from index 6 until the end of String
		System.out.println(partialString);
		 partialString = str.substring(11);
		System.out.println(partialString);
		 partialString = str.substring(0, 5);//start from 0 to index 5
		System.out.println(partialString);
		 partialString = str.substring(11, 16);
		System.out.println(partialString);
		System.out.println("===========MY OWN TYPING===========");
		String str1= "To day I am online";
		String stringindex=str1.substring(7);//here want to print from I to rest of the String
		System.out.println(stringindex);
		stringindex=str1.substring(7,11);//for reassigning we dont specify the data type
		// for example once we have specify string then we just reassign value
		System.out.println(stringindex);
		System.out.println("=========================");
		str1="I will be online for the rest of the week";
		stringindex=str1.substring(9).trim();
		System.out.println(stringindex);
	}

}
