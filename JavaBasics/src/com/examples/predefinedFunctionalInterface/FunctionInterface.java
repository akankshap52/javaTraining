package com.examples.predefinedFunctionalInterface;

import java.util.function.Function;

public class FunctionInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Integer, Double> area = r -> r*r*3.14 ; 
		
		System.out.println("Area with radius 4 is "+ area.apply(4));

	}

}
