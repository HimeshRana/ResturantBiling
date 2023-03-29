package com.restaurant.billing;

import com.restaurant.billing.security.Authentication;

public class BillingManagement {
	
	private Authentication authentication;
	
	BillingManagement() {
		this.authentication = new Authentication();
	}
	
	public static void main(String[] args) {
		new BillingManagement().start();
	}
	
	
	public void start() {
		// todo : welcome msg
		System.out.println("Welcome to the horizone restaurant");
		boolean isAuthorzed = this.authentication.isAuthorzed();
		
		if(isAuthorzed) {
			// you are authorized
			System.out.println("you are authorized.");
		} else {
			// you are not authorized
			System.out.println("you are not authorized.");
		}
	}
}
