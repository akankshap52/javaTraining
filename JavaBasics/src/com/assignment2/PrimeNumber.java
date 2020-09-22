package com.assignment2;

public class PrimeNumber {

	public boolean CheckNumber(int arr[]) {
		boolean flag = true;
		int i = (arr.length / 2);
		System.out.println("Mid value is : " + arr[i]);
		if (arr[i] == 0 || arr[i] == 1) {
			flag = false;
		} else {
			for (int j = 2; j < arr[i]; j++) {
				if (arr[i] % j == 0) {
					flag = false;
					break;
				}
			}
		}

		return flag;	
	}
	
}
