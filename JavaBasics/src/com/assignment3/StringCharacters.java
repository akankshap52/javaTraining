package com.assignment3;

import java.util.Scanner;

public class StringCharacters {
	public String checkCharacters(String str) {
		String op = null;
		int l = str.length();
		if(str.charAt(0) == str.charAt(l-1)) {
			op = "Valid String";
		}
		else {
			op = "Invalid String";
		}
		
		return op;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		System.out.println(new StringCharacters().checkCharacters(str));
		

	}

}
