package com.syntax.class03;

public class Recap {

	public static void main(String[] args) {
		int num=100;
		num=num+1000;
		System.out.println(num);
		
		//ctrl puls space is the shortcut of aotocomplete
		//shortcut for the "system.out.println is systo then (ctrl+Space)

	int a=10;
	int b=20;
	String x="Hello";
	String y="Bye";
	System.out.println(a+b+x+y);//30HelloBye
	System.out.println(a+x+b+y);//10Hello20Bye
	
	//if we have string at the beganing all other value will be added as string
	System.out.println(x+y+a+b);//HelloBye1020 (the + to the right concatinate)
	//now if we want to add value with to eachother that follows the string we do it as follow
	System.out.println(x+x+(a+b));//HelloBye30
	
	
		

	}

}
