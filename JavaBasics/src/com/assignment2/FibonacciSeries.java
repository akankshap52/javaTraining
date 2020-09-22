package com.assignment2;

import java.util.Scanner;

public class FibonacciSeries {
	public double makeSeries(int count) {
		int a1=0, a2=1,a3=0;
		double sum=1;
		System.out.println("Fibonacci series upto n values is");
		System.out.println(" " + a1);
		System.out.println(" " + a2);
		for (int i = 1; i<=count-2;i++) {
			a3 = a1 + a2;
			a1 = a2;
			a2 = a3;
			sum = sum + a3;
			System.out.println(" " + a3);
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		System.out.println("Sum is " + new FibonacciSeries().makeSeries(n));
		
		

	}

}
