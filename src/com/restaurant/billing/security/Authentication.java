package com.restaurant.billing.security;

import java.util.Scanner;

public class Authentication {

	private static final String USER_NAME = "admin";
	private static final String USER_PASSWORD = "admin";

	// java collection => list => ArrayList
	public boolean isAuthorzed() {
		Scanner sc = new Scanner(System.in);
		// code for enter user name
		System.out.print("Enter your username :");
		String username = sc.nextLine();
		// code for enter user password
		System.out.print("Enter your password :");
		String password = sc.nextLine();
		// code for for match user name and user password
		if (username.equals(USER_NAME) && password.equals(USER_PASSWORD)) {
			System.out.println("you are sucssfully login.");
			return true;
		}
		System.out.println("Username or password are incorrect. Try again!! ");
		return false;
	}

}
