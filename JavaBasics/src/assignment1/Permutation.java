package assignment1;

import java.util.Scanner;

public class Permutation {
	
	public int calFactorial(int val) {
		int factorial = 1;
		for(int i= 1; i <= val ; i++ ) {
			factorial = factorial * i;
//			System.out.println("Factorial is" + factorial );
		}
		return factorial;
	}
	
	public void calResult( int x, int y, int z) {
	int result = x/(y*z);	
	System.out.println("Final ans is "+ result);	
	}
		
	public static void main(String[] args) {
		int nFact , rFact , nrFact;
		// TODO Auto-generated method stub
		Scanner Permutation = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = Permutation.nextInt();
		Permutation permutation = new Permutation();
		nFact =  new Permutation().calFactorial(n);
		
		System.out.println("Enter r value");
		int r = Permutation.nextInt();
		rFact =  new Permutation().calFactorial(r);
		
		nrFact = new Permutation().calFactorial((n-r));
		
		new Permutation().calResult(nFact, rFact, nrFact);
		
	}

}
