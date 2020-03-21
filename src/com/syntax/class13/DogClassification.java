package com.syntax.class13;

public class DogClassification {

	public static void main(String[] args) {
		Dog dog1=new Dog();
		dog1.bread="german sheperd";
		dog1.colore="brown";
		dog1.name="Tiger";
		dog1.age=5;
		System.out.println("The dog1 colore is "+dog1.colore+" and he is "+dog1.age+" years old");
		
		
		Dog dog2=new Dog();
		dog2.bread="Gold Retriever";
		dog2.colore="brown";
		dog2.name="Tiger";
		dog2.age=5;
		
		//access behavior from the Dog class
		dog1.bark();
		dog1.play();
		dog1.run();
		System.out.println("==========Dog2 behaviors=======");
		dog2.bark();
		dog2.play();
		dog2.run();
	}

}
