package com.assignment1;

public class Account {
	
	String accountNumber; 
	double Balance;	

	public Account(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	void deposit(int amount) {
		this.Balance = amount;
	}
	double withdraw(int amount) throws InsufficientFundsException{
		if(this.Balance>=amount) {
			this.Balance = this.Balance - amount;
			return amount;
		}else {
			InsufficientFundsException Ie = new InsufficientFundsException("Insufficient Balance");
			throw Ie;
		}
	}
}
