package com.titanbankcorp.system;

import java.util.*;
public class UserInterface {

	public static void main(String[] args) {
		Factory fact = new Factory();
		
		Scanner scan = new Scanner(System.in);
		Database data = fact.getDatabase();
		
		
		data.getAccount(fact);
		System.out.println("Account Number" +" " +data.getAccountOne());
		System.out.println("Account Number" +" " +data.getAccountTwo());
		
		System.out.println("Enter your account number to transfer from");
		int from = scan.nextInt();
		System.out.println("Enter your account number to transfer To");
		int to = scan.nextInt();
		
		
		System.out.println("enter amount to transfer");		
		double amount = scan.nextDouble();
		
		data.transfer(from, to, amount);		
		
	}

}
