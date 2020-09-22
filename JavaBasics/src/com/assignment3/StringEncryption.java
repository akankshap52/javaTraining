package com.assignment3;

import java.util.Scanner;

public class StringEncryption {
	
	public String encryption(String str) {
		String op= "";
		for(int i = 0 ; i < str.length() ; i++) {
			
			if(i==0) {
				op = op + str.charAt(i);
			}
			else if(i%2 == 1) {
				
				int a = str.charAt(i);
				if (a == 122) {
					op = op + 'a';
				}
				else {
					char c = (char)(a+1);
					op = op + c;
				}
				
			}
			else {
				op = op + str.charAt(i);
			}
						
		}
		return op;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		System.out.println("string after encryption :" + new StringEncryption().encryption(str));

	}

}
