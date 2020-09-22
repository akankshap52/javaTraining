package com.assignment2;

import java.util.Scanner;

public class Palindrome {
	public String checkInt(int n) {
		int sum=0, r;
		int temp = n;
		String result = null;
		while (n> 0) {
			r=n%10;   
			sum=(sum*10)+r;    
			n=n/10;  
		}
		if(temp==sum)  result = "Palindrome";
		else result ="Not Palindrome";
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number with more than 1 digit");
		int n = sc.nextInt();
		System.out.println( new Palindrome().checkInt(n));
		
		
	}

}
