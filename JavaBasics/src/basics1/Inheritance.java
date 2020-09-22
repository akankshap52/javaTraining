package basics1;

import java.util.Scanner;

class Operations{
	int result;
	 public void addition(int val1, int val2) {
	      result = val1 + val2;
	      System.out.println("The sum of the given numbers:"+result);
	   }
}
public class Inheritance extends Operations{


	public static void main(java.lang.String[] args) {
		int val1, val2;
		  Scanner myObj = new Scanner(System.in); 
		    System.out.println("Type a number:");
		    val1 = myObj.nextInt(); // Read user input

		    System.out.println("Type another number:");
		    val2 = myObj.nextInt(); // Read user input
		    
		    Inheritance demo = new Inheritance();
		    demo.addition(val1, val2);
		    
		    
	}

}
