package com.assignment1;

public class AccountDemo {

	public static void main(String[] args) {
		System.out.println("---------------------Welcome-------------------------");
		
		Account a1 = new Account("8879898988");
		a1.deposit(5000);

		try {
			Double net_bal = a1.withdraw(6000);
			System.out.println("Withdrow Successfully Amount: " + net_bal);
			System.out.println("Remaining Balance: "+a1.Balance);
		} catch (InsufficientFundsException ie) {
			System.out.println(ie);
		}
		
		System.out.println("-------------------Thank You----------------------");
	}
}
