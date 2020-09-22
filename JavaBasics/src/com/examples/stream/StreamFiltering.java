package com.examples.stream;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFiltering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		for (int i = 1 ; i<=10;i++)
		{
			arr.add(i);
			
		}
		Stream str = arr.stream();
		Predicate<Integer> p = (n) -> n%2 == 0;
		
		ArrayList<Integer> arr1 = (ArrayList<Integer>) str.filter(p).collect(Collectors.toList());
		System.out.println(arr);
		System.out.println(arr1);
		
		Stream str1 = arr.stream();
		Function<Integer,Integer> p1 = x ->  x + 6;
		ArrayList<Integer> arr2 = (ArrayList<Integer>) str1.map(p1).collect(Collectors.toList());
	
		System.out.println(arr2);

	}

}
