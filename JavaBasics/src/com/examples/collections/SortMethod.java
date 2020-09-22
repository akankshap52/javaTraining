package com.examples.collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Cakes");
		arr.add("Chocolates");
		arr.add("Donuts");
		arr.add("Chips");
		arr.add("Candy");
		arr.add("Cupcakes");
		arr.add("Pop Tarts");
		arr.add("Brownies");
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println("After sorting" + arr);

	}

}
