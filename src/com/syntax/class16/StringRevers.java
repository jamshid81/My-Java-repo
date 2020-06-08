package com.syntax.class16;

public class StringRevers {
	static String str(String x) {
		String y="";
		
		for (int i= x.length()-1; i>=0; i--) {
			y+=x.charAt(i);
			
		}
		return y;
	}
	public static void main(String[] args) {
		
		String x ="ASU-SSELB-DOOG";
		
	System.out.println(str(x));
	
	}
	
	}
	
