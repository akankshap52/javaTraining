package com.examples.predefinedFunctionalInterface;

import java.util.function.Predicate;

public class PredicateEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<String> p  = str -> str.length() > 10;
		Predicate<Integer> n  = nmbr -> nmbr%2 == 0;
		Predicate<Integer> n1 = nmbr -> nmbr > 10 ;
		
//		System.out.println(p.test("Akanksha Patil"));
//		System.out.println(p.test("Akanksha"));
//		System.out.println(n.test(36));
//		System.out.println(n.test(35));
		
		System.out.println(n.and(n1).test(19));
		System.out.println(n.or(n1).test(19));
		System.out.println(n.negate().test(19));
		

	}

}
