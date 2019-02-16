package com.titanbankcorp.records;
public class Account {
	
	 private double AccountOnebalance=100000.00;
	 private double AccountTwobalance=100000.00;
	 private int accountOne=150078;
	 private int accountTwo =150079;
	 private double result;
	 
	public int getAccountOne(){
		 return accountOne;
	 }
	
	
	public int getAccountTwo(){
		 return accountTwo;
	 }
	
	
	 public void deposite(int accNo, double amount){		
		 
		 if(accNo ==accountOne){
			 AccountOnebalance = AccountOnebalance +amount;
		 }else if(accNo == accountTwo){
			 AccountTwobalance = AccountTwobalance + amount; 
		 }
	 }
	 
	 public void withdraw(int accNo, double amount){
		 if(accNo ==accountOne){
			 if(amount < AccountOnebalance){		
			 AccountOnebalance = AccountOnebalance -amount;
			 }else {
			System.out.println("..INSUFFICIENT BALANCE.."+" "+AccountOnebalance);
			 }
	 }else if(accNo == accountTwo){
		 	if(amount < AccountTwobalance){
		 		AccountTwobalance = AccountTwobalance - amount;
		 	}else{
		 		System.out.println("..INSUFFICIENT BALANCE.."+" "+AccountTwobalance);
		 	}
	 }
	 } 
	 
	public double getBalance(int accNo){
		if(accNo == accountOne){
			result =  AccountOnebalance;
		}else{
			if(accNo==accountTwo){
				result =  AccountTwobalance;
			}
		}
		return result;
	}
	  
}
