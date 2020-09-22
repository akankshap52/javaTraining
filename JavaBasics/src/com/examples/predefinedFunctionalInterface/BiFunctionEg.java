package com.examples.predefinedFunctionalInterface;

import java.util.function.BiFunction;

class Student{
	int id;
	String name;
	
	public Student(int id , String name){
		this.id = id;
		this.name = name ;
	}

	@Override
	public String toString() {
		return "Student [id = " + id + ", name =" + name +  "]";
	}
}
public class BiFunctionEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiFunction<Integer,String,Student> std = (id,name) -> new Student(id,name);
		
		Student s = std.apply(209, "Akanksha");
		System.out.println(s);

	}



}
