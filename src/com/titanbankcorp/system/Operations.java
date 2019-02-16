package com.titanbankcorp.system;
import com.titanbankcorp.records.Account;

public class Operations extends Database{
	Account acc;
	public void getAccount(Factory fact){
		this.acc = fact.getAccount();
	}
	
	public int getAccountOne(){
		return acc.getAccountOne();
	}
	
	
	
	public int getAccountTwo(){
		return acc.getAccountTwo();
	}
	
	
	
	public void deposit(int accNo, double amount){
			acc.deposite(accNo, amount);			
			 System.out.println("In account " + accNo +" " + "Amount" +amount + " is credeted Updated balance is " +accNo +" " + acc.getBalance(accNo));
	}

	
	
	public void withdraw(int accNo, double amount){
		 acc.withdraw(accNo, amount);	
		
		 System.out.println("In account " +accNo +" remaining balance is "  +" " + acc.getBalance(accNo));
			 }
		 	
	
}
