package com.examples.predefinedFunctionalInterface;

import java.util.ArrayList;
import java.util.function.Function;

class StudentMarks{
	int marks;
	String name;
	
	public StudentMarks(String name, int marks){
		this.marks = marks;
		this.name = name ;
	}

	@Override
	public String toString() {
		return "Student [name = " + name + ", marks =" + marks +  "]";
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
public class FunctionWithObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<StudentMarks> arr = new ArrayList<>();
		
		StudentMarks s1 = new StudentMarks ("Akanksha" , 68);
		StudentMarks s2 = new StudentMarks ("Priya" , 78);
		StudentMarks s3 = new StudentMarks ("Poorva" , 90);
		StudentMarks s4 = new StudentMarks ("Ajinkya" , 88);
		StudentMarks s5 = new StudentMarks ("Kinage" , 50);
		StudentMarks s6 = new StudentMarks ("Sudhanshu" , 24);
		
		 arr.add(s1);
		 arr.add(s2);
		 arr.add(s3);
		 arr.add(s4);
		 arr.add(s5);
		 arr.add(s6);
		 
		 System.out.println(arr);
		 
		 Function<StudentMarks , String> fn = (StudentMarks) ->
		
		 {
			 String Grade = "First Class" ;
			if (StudentMarks.getMarks() >= 75) {
				 Grade = "Distinction" ;
			}
			else if ( StudentMarks.getMarks() >= 60 && StudentMarks.getMarks() <= 74) {
				 Grade = "First Class" ;
			}
			else if (StudentMarks.getMarks() >= 40 && StudentMarks.getMarks() <= 59) {
				Grade = "Pass class" ;
			}
			else {
				 Grade = "Fail" ;
			}
			return Grade;
		 };
		 
		 for(StudentMarks s : arr) {
	            System.out.println("Name : " + s.getName() + " , Grade : " + fn.apply(s));
	        }
	        
	}

}
