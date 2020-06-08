package com.syntax.class18;

public class StudentClass {
//	Write program as a Student class   that has instance
//	variables name and address. Create a constructor that
//	will initialize those variables. Print name & address of
//	given  student using displayInfo method.
//
//	Write program as a Book class   that will have 2 Constructors.
//	While creating an object make sure:
//	Instance variables are being initialized
//	Both Constructors are being executed
String name, Address;

StudentClass(String name, String Address){
	this.name=name;
	this.Address=Address;
}
public void displayInfo(String name, String Address) {
	System.out.println(name+" "+Address);
	
	System.out.println(this.name+" "+this.Address);
	
}
public static void main(String[]args) {
	StudentClass obj=new StudentClass("Rohani"," Virginia");
	obj.displayInfo("Faisal", "Fairfax");
}

}
//String name;
//String address;
//Task1Student(String name, String address){
//	this.name=name;
//	this.address=address;
//}
//public void  displayInfo() {
//   System.out.println("Student name is "+name+" and student address is "+address);
//}
//public static void main(String[] args) {
//	Task1Student obj= new Task1Student("John","New york");
//		obj.displayInfo();
//}
