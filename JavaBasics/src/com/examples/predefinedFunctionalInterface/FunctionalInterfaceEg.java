package com.examples.predefinedFunctionalInterface;

public class FunctionalInterfaceEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//not a predefined functional interface
		
		Runnable r = () -> {
			for ( int i=1; i<=50; i++)
				System.out.println(i);
		};
		
		Thread t = new Thread(r);
		t.start();

	}

}
