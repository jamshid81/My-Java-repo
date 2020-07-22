package com.syntax.class01;

public class InterviewQuestionPractice {

	public static void main(String[] args) {

		String sentence="Neda Yasra Hamza";
		String str;
		str=sentence.substring(3);
		System.out.println(str);
	for (int i=sentence.length()-1; i>=0; i--) {
		char reverse;
		reverse=sentence.charAt(i);
		System.out.print(reverse);
	}
	
	String str1="Kayak";
	char str2 = 0;
	for (int x= str1.length()-1; x>0; x--) {
		str2=str1.charAt(x);
	}
	System.out.print(str2);

	}

}
