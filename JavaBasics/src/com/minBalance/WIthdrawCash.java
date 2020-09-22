package com.minBalance;

import java.util.Scanner;



public class WIthdrawCash {
	


public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Checkbalance agc = new Checkbalance();
    System.out.println("Enter the amount to be withdrawn");
    int amount = sc.nextInt();
    try {
        agc.withdrawAmount(amount);
        System.out.println("Withdraw successful, Balance is "+ new Checkbalance().withdrawAmount(amount) );
    }
    catch(InsufficientFundsExceptions e)
    {
        System.out.println(e);
    }	
}
}
