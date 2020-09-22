package com.assignment3;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.votingAge.InvalidAgeException;

public class PasswordValidation {
	
	public void ValidatePassword(String str) {
		
		boolean result = Pattern.matches("[a-zA-Z]{1}[a-zA-Z0-9@#_]{6,}[a-zA-Z0-9]{1}",str);
		if (result) {
			System.out.println("Password valid");
		}
		else {
            throw new InvalidPasswordException("Password is Invalid");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Password");
		String str = sc.nextLine();
		try {
			new PasswordValidation().ValidatePassword(str);
		}
		 catch(InvalidPasswordException e)
        {
            System.out.println(e);
        }
	}

}
