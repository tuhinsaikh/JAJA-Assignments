package com.assignment1;

public class InsufficientFundsException extends Exception{

	String massage;

	public InsufficientFundsException(String massage) {
		super(massage);
	}
	
}
