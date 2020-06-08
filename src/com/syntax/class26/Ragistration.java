package com.syntax.class26;

public class Ragistration {
	private String email;
	private String userName;
	private String password;

	public String getEmail() {
		return email;
	}

	public String getUserName() {
		return userName;

	}

	public String getPassword() {
		return password;
	}

	public void setEmail(String email) {
		if (email.contains("yahoo")) {

			this.email = email;
		}
	}

	public void setUserName(String userName) {
		this.userName = userName;

	}

	public void setPassword(String password) {
		if (!password.isEmpty() && password.length() > 6) {
			if (!password.contains(userName)) {
				this.password = password;
			} else {
				System.out.println("The password can not cantian username");
			}
		} else {
			System.out.println("The password must not be empty and have less thatn 6 charecters");

		}
	}
}