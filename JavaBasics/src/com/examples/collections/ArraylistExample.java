package com.examples.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArraylistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Cakes");
		arr.add("Chocolates");
		arr.add("Donuts");
		arr.add("Chips");
		arr.add("Candy");
		arr.add("Milkshake");

		ArrayList<String> arr1 = new ArrayList<>();
		arr1.add("Cupcakes");
		arr1.add("Pop Tarts");
		arr1.add("Brownies");
		
		arr.addAll(arr1);
		
		System.out.println(arr);
		
		arr.remove("Cupcakes");
		System.out.println(arr);
		
		System.out.println(arr.contains("Brownies"));
		
		arr.retainAll(arr1);
		System.out.println(arr);
		
//		ListIterator<String> itr = arr.listIterator();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		System.out.println("reverse order=============>");
//		while(itr.hasPrevious()) {
//			System.out.println(itr.previous());
//		}
//		System.out.println("Using for loop=============>");
//		
//		for (String dessert:arr) {
//			System.out.println(dessert);
//		}
		
	}

}
