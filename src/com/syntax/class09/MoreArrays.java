package com.syntax.class09;

public class MoreArrays {

	public static void main(String[] args) {
		//every array index must start will (0)
		String[] student=new String[3];
		student[0]="Ahmad";
		student[1]="Mahmood";
		student[2]="Kabli";
		//student [3]="Maqsood"; if add this line the console will display error; remove the // for practice
		//if we have more arrays than specified number the compiler will accept that but in the console it
		// will give error
		System.out.println(student[1]+" and "+student[2]+" are brothers");
		
		// if we store less elements than we declared, compiler will add default value which is "null"
		String[]inClassStudents=new String[5];
		inClassStudents[0]="Faisal";
		inClassStudents[1]="Rohani";
		System.out.println(inClassStudents[4]);
		

	}

}
