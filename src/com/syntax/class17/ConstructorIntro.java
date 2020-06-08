package com.syntax.class17;

public class ConstructorIntro {
//	ConstructorIntro(){
//to create a constructor: 1. no return type (not even void)
//							2. name must be same as class name
//ConstructorIntro(){
//	System.out.println("I am a constructor");
//}
//
//public static void main(String[] args) {
//	
//	ConstructorIntro obj=new ConstructorIntro();
//	
//	System.out.println("Code after constructor");
//	
//	obj.hello();
//
//}
//
//void hello() {
//	System.out.println("Hello Class");
//}

ConstructorIntro(){
	System.out.println("This constructor is withoud the parameters");
}
ConstructorIntro(String conWP){

	System.out.println("This constructor is with the parameter "+conWP);
}
public static void main(String[] args) {
	ConstructorIntro con=new ConstructorIntro();

	ConstructorIntro con1=new ConstructorIntro("(Hello)");
}
}

