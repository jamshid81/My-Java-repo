package com.syntax.class30;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Map.Entry;

public class SetReple {
	
	public static void main(String[] args) {
	
		Set<Student> details=new LinkedHashSet<>();
		
		details.add(new Student("Samair","Jawaid",101));
		details.add(new Student("Asel", "Umurzakova",102));
		details.add(new Student("Diego","Juarez",103));
		details.add(new Student("Sohil","Aryan",104));
		details.add(new Student("Alijon","Nazarov",105));
		System.out.println(details.size());
		
		for(Student f:details) {
			f.display();
			
		
	
		}

//		Set<String> teacher = new LinkedHashSet<>();
//		teacher.add("null");
//		teacher.add("Sohil");
//		teacher.add("Diego");
//		teacher.add("Alijon");
//		teacher.add("Asel");
//		teacher.add("Sumair");
//
//		for (String t : teacher) {
//			System.out.println(t);
//		}
//		Iterator<String> it = teacher.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}

	}

}
class Student{
	  
	   String name;
	   String lastName;
	   int studentID;
	   Student(String name, String lastName, int studentID){
	   this.name=name; this.lastName=lastName; 
	   this.studentID=studentID;
	   }
	  public void display() {
		  System.out.println("Student details: "+name+" "+lastName+" with id: "+studentID);
	  }
	}

