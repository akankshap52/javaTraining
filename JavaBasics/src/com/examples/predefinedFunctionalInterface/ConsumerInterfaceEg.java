package com.examples.predefinedFunctionalInterface;

import java.util.function.Consumer;

public class ConsumerInterfaceEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<Integer> tables = n ->
			
		{
			for (int i= 1 ; i<=10; i++)
				System.out.println( n + " * " +  i + " = " + n*i);
		};
		
		tables.accept(5);
	}

}
