package assignment1;

import java.util.Scanner;

public class Sorting {
	public int[] Sort(int n1, int arr[]) {
		  for(int i = 0; i < n1; i++) {
		         for(int j=1; j < (n1-i); j++) {
		            if(arr[j-1] > arr[j]) {
		              int temp = arr[j-1];
		               arr[j-1] = arr[j];
		               arr[j] = temp;
		            }
		         }
		      }
		return arr;
	}

	public static void main(String[] args) {
		int n1;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter length of Array:");
        n1 = s.nextInt();
        int a1[] = new int[n1];
        System.out.println("Enter elements of Array:");
        for(int i = 0; i < n1; i++)
        {
            a1[i] = s.nextInt();
            
        }
        int a2[] = new int[n1];
        a2 = new Sorting().Sort(n1, a1);
        System.out.println("Sorted Array is : ");
      for(int k= 0 ; k< n1 ;k++) {
    	  System.out.println(a2[k]);
      }
        
        
//       
	}

}
