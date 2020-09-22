package com.assignment2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayAvg {
	public float calAvg(int arr[]) {
		float sum =arr[2] ;
		int count = 1 ;
		boolean flag = true;
		for (int i = 3 ;i<arr.length;i++) {
			for (int j=2; j < i ; j++) {
				if (i%j == 0) {
					flag = false;
					
					}
			}
			if (flag) {sum = sum + arr[i];
						count++;}
			else {sum = sum;}
			flag = true;
		}
		
		return (sum/count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        Scanner s = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("##.00");
        System.out.print("Enter length of Array:");
        n = s.nextInt();
        int a1[] = new int[n];
        System.out.println("Enter elements of Array:");
        for(int i = 0; i < n; i++)
        {
            a1[i] = s.nextInt();
            
        }
        float result = new ArrayAvg().calAvg(a1);
        System.out.println("Average is "+ f.format(result));
       
	}

}
