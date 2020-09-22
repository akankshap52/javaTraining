package basics1;

import java.util.Scanner;

public class BasicOperations {

	public static void main(String[] args) {
		 int val1, val2 , opn;
		
		    Scanner myObj = new Scanner(System.in); 
		    System.out.println("Type a number:");
		    val1 = myObj.nextInt(); // Read user input

		    System.out.println("Type another number:");
		    val2 = myObj.nextInt(); // Read user input
		    
		    System.out.println("Type 1 for addition , Type 2 for substraction");
		    opn = myObj.nextInt(); // Read user input
		    
//		    if(opn == 1) {
//		    	System.out.println("Addition of 2 numbers is " + (val1+val2)); //addition of 2 numbers
//		    }
//		    else if(opn == 2) {
//		    	if(val1 >= val2) {
//		    		System.out.println("Substraction of 2 numbers is " + (val1-val2));	//subn based on which is greater number
//		    	}
//		    	else {
//		    		System.out.println("Substraction of 2 numbers is " + (val2-val1));	
//		    	}
//		    	
//		    }
		    switch(opn) {
		    
		    case 1 :
		    System.out.println("Addition of 2 numbers is " + (val1+val2)); //addition of 2 numbers
		    break;
		    
		    case 2 :
		    	if(val1 >= val2) {
	    		 System.out.println("Substraction of 2 numbers is " + (val1-val2));	//subn based on which is greater number
		    	}
		    	else {
		    		System.out.println("Substraction of 2 numbers is " + (val2-val1));	
		    	}
		    break;
		    
		    default : 
		    	System.out.println("Invalid Input");
		    }
		    
	}

}
