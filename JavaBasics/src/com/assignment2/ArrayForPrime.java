package com.assignment2;

import java.util.Scanner;

public class ArrayForPrime extends PrimeNumber{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a odd number");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements of Array");
		for(int i=0;i<n;i++) a[i]=sc.nextInt();
		boolean flag = new PrimeNumber().CheckNumber(a);
		if(flag) System.out.println("Middle element is a Prime Number");
		else System.out.println("Middle element is not a Prime Number");

	}

}
