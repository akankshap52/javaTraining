package basics1;

import java.util.Scanner;

public class ConditionalOperators {

	public static void main(String[] args) {
		 int val1, val2 , opn , result;
			
		    Scanner myObj = new Scanner(System.in); 
		    System.out.println("Type a number:");
		    val1 = myObj.nextInt(); // Read user input

		    System.out.println("Type another number:");
		    val2 = myObj.nextInt(); // Read user input
		    
		    System.out.println("Type 1 for addition , Type 2 for substraction");
		    opn = myObj.nextInt(); // Read user input
		    
		    result = (opn == 1) ? (val1+val2): (val1-val2);  //check which opn to be performed and assign value accordingly
		    System.out.println("Result is " + result);
		    
	}

}
