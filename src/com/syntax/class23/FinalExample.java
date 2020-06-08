package com.syntax.class23;

public class FinalExample {
final String str="I love java";
	
	final void saySmth(String str) {

		System.out.println(this.str);
	}
	
	public static void main(String[] args) {
	
		FinalExamples obj=new FinalExamples();
		obj.hello();
		obj.hello("Ahmad");
		SubClass obj1=new SubClass();
		obj1.hello(3);
	
		//obj.str="I do not like java";CE: final variables cannot be modified
	}
}