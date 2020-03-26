package com.syntax.class14;

public class LargerNumber {

	void plindrum(String str) {
		String strR = "";
		for (int i=str.length()-1;i>=0; i--) {
			strR=strR+str.charAt(i);
			if (strR.equals(str)) {
			System.out.println(str + " is plindrom");
			}
		} if (!strR.equals(str))
			System.out.println(str+" is not a plindrom ");
	}

	void large(int c, int d) {
		if (c > d) {
			System.out.println(c + "is larger number than " + d);
		} else {
			System.out.println(d + " is larger than " + c);
		}
	}

	void oddEven(int a) {
		if (a % 2 == 0) {
			System.out.println(a + " is even number");
		} else {
			System.out.println(a + " is odd number");

		}
	}

	public static void main(String[] args) {
		LargerNumber obj = new LargerNumber();
		obj.oddEven(50);
		obj.large(5, 78);
		obj.plindrum("madam");
	}
}
