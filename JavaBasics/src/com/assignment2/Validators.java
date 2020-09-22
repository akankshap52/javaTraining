package com.assignment2;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Validators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter phone number");
		String n = sc.nextLine();
		boolean result = Pattern.matches("[0-9]{3}-[0-9]{3}-[0-9]{4}",n);
		if (result) System.out.println("Valid Pattern");
		else System.out.println("Invalid Pattern");
	}

}
