package com.syntax.class11;
import java.util.Scanner;
public class InClassTaskOfStringFunctions {

	public static void main(String[] args) {
		
		String massage="";
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your user name");
		String username=scan.nextLine();
		if (username.isEmpty()) {
			massage="username can not be empty";
			System.out.println(massage);
		}else {System.out.println("Please enter you password");
		String password=scan.nextLine();
		int pass=password.length();
		if (password.isEmpty()) {
			massage="password can not be empty";
			System.out.println(massage);
		}else {
			System.out.println("Please confirm you password");
			String passwordConfirm=scan.nextLine();
		 if(!password.equals(passwordConfirm)) {
			System.out.println("Password does not match");
		}else if(pass<8) {
			massage="password is too short";
			System.out.println(massage);
			
			
		}else if (password.contains(username)) {
			System.out.println("Password can not cantain user name");
			
		}else {
			
			System.out.println("your username and password has been accepted");
		}
		}
	}
	}
}
