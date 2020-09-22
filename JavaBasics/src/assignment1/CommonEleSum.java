package assignment1;

import java.util.Scanner;

public class CommonEleSum {
	public int findCommon(int arr1[], int arr2[]) {
		int sum = 0;
		 for(int i = 0; i < arr1.length; i++) {
			 for (int j = 0 ; j< arr2.length; j++ ) {
				 if (arr1[i] == arr2[j]) {
					sum = sum + arr1[i];
				 }
			 }
		 }
		 return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 ,n2;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter length of 1st Array:");
        n1 = s.nextInt();
        int a1[] = new int[n1];
        System.out.println("Enter elements of 1st Array:");
        for(int i = 0; i < n1; i++)
        {
            a1[i] = s.nextInt();
            
        }
        System.out.print("Enter length of 2nd Array:");
      n2 = s.nextInt();
      int a2[] = new int[n2];
      System.out.println("Enter elements of 2nd Array:");
      for(int i = 0; i < n1; i++)
      {
          a2[i] = s.nextInt();
          
      }
      System.out.println("sum of common elements is : " +new CommonEleSum().findCommon(a1, a2));

	}

}
