package com.assignment3;

import java.util.Scanner;

public class StringInt {
	
	public void modifyString(String str , int n) {
		
		if(n > str.length()) {
		System.out.println("Invalid n");
		}
		else {
			String str1 = str.substring(0, n);
			int n1=str.length() - n;
			String str2 = str.substring(n1);
			System.out.println("Final String " + str1.concat(str2) );
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.nextLine();
		System.out.println("Enter n less than " + (str.length()+1));
		int n = sc.nextInt();
		new StringInt().modifyString(str, n);
	}

}
