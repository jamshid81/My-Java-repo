package com.syntax.class12;

public class NewTastStringFunction {

	public static void main(String[] args) {
		System.out.println("------TaskOne----------");
		String str="Today Class is confusing";
		String str1=str.replace(" " , "");
		System.out.println(str1);
		
		System.out.println("-------TaksTwo-------");
		String str2= "Corrona Viruse Deases 2019*$@&";
	
		String str3=str2.replaceAll("[^A-Za-z]", "");
		System.out.println(str3.length());
		
			
		}
		
	
		
		
	}
