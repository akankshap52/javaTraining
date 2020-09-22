package com.assignment3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ColourCodeValidation {
	
	public void ValidateCode(String str) {
		boolean result = Pattern.matches("#[0-9A-F]{6}",str);
		if (result) System.out.println("Valid colour code");
		else System.out.println("Invalid colour code");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter colour code");
		String str = sc.nextLine();
		new ColourCodeValidation().ValidateCode(str);
	}

}
