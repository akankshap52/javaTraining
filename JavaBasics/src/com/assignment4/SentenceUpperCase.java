package com.assignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class SentenceUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String capitalizeWord="";
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		
		   for(String w:arr){  
		        String first=w.substring(0,1);  
		        String afterfirst=w.substring(1);  
		        capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
		    } 
		   System.out.println(capitalizeWord.trim());

	}

}
