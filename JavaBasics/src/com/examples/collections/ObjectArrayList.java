package com.examples.collections;

import java.util.ArrayList;
import java.util.Iterator;

class Employee{
    String empid;
    String empname;
    @Override
    public String toString() {
        return "Employee [empid=" + empid + ", empname=" + empname + "]";
    }
    public Employee(String empid, String empname) {
        super();
        this.empid = empid;
        this.empname = empname;
    }
    public String getEmpid() {
        return empid;
    }
    public void setEmpid(String empid) {
        this.empid = empid;
    }
    public String getEmpname() {
        return empname;
    }
    public void setEmpname(String empname) {
        this.empname = empname;
    }
	}
public class ObjectArrayList {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    ArrayList<Employee> list = new ArrayList<>();
	       
	        Employee e1 = new Employee("1001","Sourab");
	        Employee e2 = new Employee("1002","Monica");
	        Employee e3 = new Employee("1003","Shreya");
	       
	        list.add(e1);
	        list.add(e2);
	        list.add(e3);
	       
	        System.out.println(list);
	       
	        Iterator<Employee> itr = list.iterator();
	            while(itr.hasNext())
	                System.out.println(itr.next());
	       
	        for(Employee emp : list) {
	            System.out.println(emp.getEmpid()+"  "+emp.getEmpname());
	        }
	      

	}

}
