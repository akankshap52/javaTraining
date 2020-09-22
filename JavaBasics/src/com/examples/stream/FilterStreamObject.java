package com.examples.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Employee{
	int salary;
	String designation;
	String name;
	
	public Employee(String name, String designation , int salary){
		super();
		this.salary = salary;
		this.name = name ;
		this.designation = designation ;
	}

	@Override
	public String toString() {
		return "Student [name = " + name + ",  designation =" + designation +  ",salary =" + salary +  "]";
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}




}

public class FilterStreamObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		ArrayList<Employee> arr = new ArrayList<>();
		
		Employee s1 = new Employee ("Akanksha" , "TASA" , 1020);
		Employee s2 = new Employee ("Priya" ,"Manager", 1800);
		Employee s3 = new Employee ("Poorva" ,"TASA", 1025);
		Employee s4 = new Employee ("Ajinkya" ,"Project Lead", 3000);
		Employee s5 = new Employee ("Kinage" ,"Delivery head", 2000);
		Employee s6 = new Employee ("Sudhanshu" ,"TASA", 1030);
		
		 arr.add(s1);
		 arr.add(s2);
		 arr.add(s3);
		 arr.add(s4);
		 arr.add(s5);
		 arr.add(s6);
		 
		 System.out.println(arr);
		 System.out.println("=========================");
		 Stream str = arr.stream();

		 Predicate<Employee> p = (Employee) -> Employee.getSalary() > 1500;
        // Function<Employee , Integer> p = (Employee) -> Employee.getSalary() + 1000;
		// ArrayList<Integer> arr1 = (ArrayList<Integer>) str.filter(p).collect(Collectors.toList());
		 ArrayList<Integer> arr1 = (ArrayList<Integer>) str.filter(p).collect(Collectors.toList());
		 System.out.println(arr1);
		 
		 System.out.println("=========================");
	       
		 Stream str2 = arr.stream();
			
		 Comparator<Employee> c = (s9,s10)->s9.getName().compareTo(s10.getName());
	     List<Employee> arr2 = arr.stream().sorted(c).collect(Collectors.toList());
	     System.out.println(arr2);
	     
	     System.out.println("=========================");
	}

}
