package assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElement {
	public String searchArray(int x, int n,int arr[]) {
		String flag = null;
		  for (int i = 0; i < n; i++) {
			  if (x == arr[i]) flag = "yes";
			  else flag ="no";
		  }
	          
		return flag;
		
	}
	
	public static void main(String[] args) {
		 int n , ele;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements:");
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for(int i = 0; i < n; i++)
	        {
	            a[i] = s.nextInt();
	            
	        }
	        System.out.print("Enter element to find:");
	        ele = s.nextInt();
	        System.out.println("Is element present in array?  "+ new ArrayElement().searchArray(ele, n, a));

	}

}
