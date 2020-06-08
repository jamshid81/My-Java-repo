package com.syntax.class24;

public abstract class Computer {

	public void edit() {
		System.out.println("All Computers edits");
	}

	public void close() {
		System.out.println("All Computers closes");
	}

	public abstract void open();
}
class Mac extends Computer{

	@Override
	public void open() {
		System.out.println(". However, Mac Computers open in fancy way");
		
	}
	
}
class HP extends Computer{
	public void open() {
		System.out.println(". However, HP Computers open in one touch");
	}
}
class Asus extends Computer{
	public void open() {
		System.out.println(".  However, Asus Computer open in one touch and fancy way");
	}
}


	



//Create a class File that will have the following behaviors: 
//open, edit, close.
//Edit and close are implemented method while open is an abstract.
//Create 3 subclasses: 
//JavaFile, WordFile, PDFFile that will provide specific implementation of open behaviour:
//Example: to open .java file we need notepad++ or sublime text, to open 
//doc file we need Microsoft word to be installed etc