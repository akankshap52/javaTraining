package assignment1;

import java.util.Scanner;

public class ArrayPowers {
	public double calTotal(int n, int arr[]) {
		double result = 0;
		 for (int i = 0; i < n; i++) {
			  result = result + Math.pow(arr[i],i ) ;
		  }
		return result;
		
	}

	public static void main(String[] args) {
		int n;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements:");
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for(int i = 0; i < n; i++)
	        {
	            a[i] = s.nextInt();
	            
	        }
	        System.out.println("Result is:  "+ new ArrayPowers().calTotal(n, a));

	}

}
