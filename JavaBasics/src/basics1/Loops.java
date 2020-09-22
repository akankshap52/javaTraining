package basics1;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		int a;
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Enter length of array");
		a = myObj.nextInt(); // Read user input
		int seq[]= new int[a];
		
		for(int i=0 ;i<a; i++)//length is the property of array  
		{
			seq[i]= i ;
			System.out.println(seq[i]); 
		}

	}

}
