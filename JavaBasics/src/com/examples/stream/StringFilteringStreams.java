package com.examples.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StringFilteringStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Akanksha");
		arr.add("Sudhanshu");
		arr.add("Kinage");
		arr.add("Sumeet");
		arr.add("Sagar");
		
		Stream str = arr.stream();
		Predicate<String> p = (n) -> n.charAt(0) == 'S';
		
		ArrayList<String> arr1 = (ArrayList<String>) str.filter(p).collect(Collectors.toList());
		System.out.println(arr);
		System.out.println(arr1);
		
		Stream str1 = arr.stream();
		long count = (long)str1.filter(p).count();
		
		System.out.println(count);
		System.out.println("=========================");
		Stream str2 = arr.stream();
		ArrayList<String> arr2 = (ArrayList<String>) str2.filter(p).sorted().collect(Collectors.toList());
		
		System.out.println(arr2);
		System.out.println("=========================");
		arr.stream().forEach(s->
		{
		      s=s+" Hai";
		      System.out.println(s);
		});
		System.out.println("=========================");
	    Comparator<String> c = (c1,c2)->c1.compareTo(c2);
	    String minString = arr.stream().min(c).get();
	    String maxString = arr.stream().max(c).get();
	    System.out.println("Minimum String:"+minString);
	    System.out.println("Maximum String:"+maxString);
	 

		
	}

}
