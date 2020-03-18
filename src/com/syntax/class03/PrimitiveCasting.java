package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {

//casting in java means the conversion of one type into another type
		
		//there are two type of casting in java: 1. widening (implicite or automatic)
		//2. Narrowing (explicite or manual)
		//widening is done by system automaticly whil narrowing is done manualy
		//forexample double can take the bite value automaticaly while int cannot take the 
		//value of float or double or long
		
		double d=10;
		System.out.println(d);//10.0
		//int i=10.99-->compile time error sayin "type mismuch, cannot convert double to int
		
		//narrowing, explicityly implementing; therefor, it should be typ as int i=(int)10.99
		

		int i=(int)10.99;
		byte b=(byte)128;// when run it, it only store upto 127 (the maximum space for byet)
		System.out.println(b);
		
		long x1=(long)500.4444;
		System.out.println(x1);
		
		
		
		

	}

}
