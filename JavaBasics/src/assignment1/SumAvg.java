package assignment1;

import java.util.Scanner;

public class SumAvg {

	public int calSum(int n,int arr[]) {
		int sum = 0;
		  for (int i = 0; i < n; i++) {
			  sum = sum +arr[i] ;
		  }
		  
		return sum;
	}
	public float calAvg(int n,int sum) {
		float avg = sum/(n+1);
		 
		return avg;
	}
	
	
	public static void main(String[] args) {
		
		 int n,sum;
		 float avg;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements:");
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for(int i = 0; i < n; i++)
	        {
	            a[i] = s.nextInt();
	            
	        }
	        
	        sum = new SumAvg().calSum(n,a);
	        avg = new SumAvg().calAvg(n, sum);
	        System.out.println("Sum of elements of array is : " +sum+ " and Average is : " +avg);

	}

}
