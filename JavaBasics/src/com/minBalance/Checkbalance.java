package com.minBalance;

public class Checkbalance {
	
	
	public int withdrawAmount(int wdAmnt) {
		int balance = 6000 ;
		balance = balance - wdAmnt;
		if (balance < 2000) {
			throw new InsufficientFundsExceptions("Insufficient min bal after withdrawal");
		}
		else return balance;
	}

}
