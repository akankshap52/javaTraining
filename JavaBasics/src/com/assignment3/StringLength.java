package com.assignment3;

import java.util.Scanner;

public class StringLength {
	
	public void checkLength(String str1, String str2) {
		
		String op = "";
		
		
		if(str1.length() == str2.length()) {
			op = str1.concat(str2);
		}
		else if(str1.length() > str2.length()){
			str1 = str1.substring(0, str2.length());
			op = str1.concat(str2);
		}
		else {
			str2 = str2.substring(0, str1.length());
			op = str1.concat(str2);
		}
		System.out.println("final String " + op);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first string");
		String str1 = sc.nextLine();
		System.out.println("Enter second string");
		String str2 = sc.nextLine();
		new StringLength().checkLength(str1, str2);
	}

}
