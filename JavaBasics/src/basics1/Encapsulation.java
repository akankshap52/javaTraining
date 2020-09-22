package basics1;

import java.util.Scanner;

public class Encapsulation {
	
	 private String name;
	 private int age;
	 
	public static void main(String[] args) {
		
		Encapsulation encap = new Encapsulation();
		 String a;
		 int b;
			
		    Scanner myObj = new Scanner(System.in); 
		    System.out.println("Enter Name:");
		    a = myObj.nextLine(); // Read user input

		    System.out.println("Enter age:");
		    b = myObj.nextInt(); // Read user input
		    
		    
		    
		      encap.setName(a);
		      encap.setAge(b);
		     
		      
		   System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
