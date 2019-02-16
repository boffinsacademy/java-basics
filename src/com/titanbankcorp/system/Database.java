package com.titanbankcorp.system;

import com.titanbankcorp.records.Account;
//Class must be abstract since it has abstract methods.
public abstract class Database {
	public abstract void getAccount(Factory fact);
	public abstract int getAccountOne();
	public abstract int getAccountTwo();
	// Abstract and available from anywhere.
				public abstract void deposit(int accNo, double amount);

				public abstract void withdraw(int accNo, double amount);

			

	//Unmodifiable and only available from package.
				final void transfer(int from, int to, double amount) {
				withdraw(from, amount);
				deposit(to, amount);
		}
}