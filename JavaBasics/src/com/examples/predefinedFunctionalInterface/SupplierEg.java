package com.examples.predefinedFunctionalInterface;

import java.util.function.Supplier;

public class SupplierEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<Double> s = ()-> Math.random();
		
		System.out.println("Get 1" + s.get());
		System.out.println("Get 2" + s.get());
		System.out.println("Get 3" + s.get());
		System.out.println("Get 4" + s.get());

	}

}
