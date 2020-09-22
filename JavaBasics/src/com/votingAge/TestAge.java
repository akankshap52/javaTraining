package com.votingAge;

import java.util.Scanner;

public class TestAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        AgeChecker agc = new AgeChecker();
       
        System.out.println("Enter the age");
        int age = sc.nextInt();
        try {
            agc.checkAge(age);
        }
        catch(InvalidAgeException e)
        {
            System.out.println(e);
        }
	}

}
