package com.syntax.class23;

public class CompterTest {

	public static void main(String[] args) {
		Computer mac=new Apple("Apple MacBook");
		Computer comLenovo=new Lenovo ("Lenovo Computers");
		Computer comHP=new HP("HP Computers");
		Computer comDell=new Dell("Dell Computers");
		
		Computer[] com= {new Apple("Apple MacBook"),new Lenovo ("Lenovo Computers"),new HP("HP Computers"),new Dell("Dell Computers")};
		for (Computer all:com) {
			all.hightech();
			all.display();
			System.out.println("-----------------   ----------------");
			
		}
	}

}
