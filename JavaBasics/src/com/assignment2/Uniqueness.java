package com.assignment2;

import java.util.Scanner;

public class Uniqueness {
	
	public boolean checkUniqueness(int val) {
		System.out.println("val " + val);
		int i=0, r;
		int temp = val;
		 int a[] = {0};
		 boolean flag = false;
		while (val > 0) {
			r=val%10; 
			a[i]=r;
			i++;
			val = val/10;
			System.out.println("===" + a[i]);
		}
		
		for (int j=0; j<= i ;j++) {
			for (int k= j; k <= i ; k++) {
				if(a[j] == a[k]) {
					flag = true;
					break;	
				}
			}
		}
		
	 return flag;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		new Uniqueness().checkUniqueness(n);
	
	}
	

}
