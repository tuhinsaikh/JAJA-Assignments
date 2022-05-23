package com.assignment;

import java.util.Scanner;

public class AccountDetails {
//	public Account getAccountDetails() {
//		Account a1 = new Account();
//		return a1;
//	}
//	public int getWithdrawAmount() {
//		this.getWithdrawAmount();
//		return getWithdrawAmount();
//	}
	public static void main(String[] args) {
		Account a = new Account();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account id: ");
		a.setAccountId(sc.nextInt());
		
		System.out.println("Enter account type: ");
		a.setAccountType(sc.next());
		
		System.out.println("Enter balance: ");
//		if(sc.nextInt()<0) {
//			System.out.println("Balance should be positive");
//			
//		}else {
//			a.setBalance(sc.nextInt());
//			System.out.println("Enter amount to be withdrawn: ");
//			a.withdraw(sc.nextInt());
//		}
		a.setBalance(sc.nextInt());
		
		
		System.out.println("Enter amount to be withdrawn: ");
		a.withdraw(sc.nextInt());
	}
}









