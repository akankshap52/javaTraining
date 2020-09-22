package com.examples.predefinedFunctionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<String,String> p  = (str1,str2) -> str1.length() > str2.length();
		BiPredicate<Integer, Integer> n  = (a,b) -> a%b == 0;
		
		System.out.println(p.test("Akanksha Patil", "Priya"));
		System.out.println(p.test("Akanksha" , "Priya Khanolkar"));
		System.out.println(n.test(90,5));
		System.out.println(n.test(37,7));
	}

}
