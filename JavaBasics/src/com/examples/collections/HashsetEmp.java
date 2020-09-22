package com.examples.collections;

import java.util.ArrayList;
import java.util.HashSet;

class Employee1{
    String empid;
    String empname;
    @Override
    public String toString() {
        return "Employee [empid=" + empid + ", empname=" + empname + "]";
    }
    public Employee1(String empid, String empname) {
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
public class HashsetEmp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    HashSet<Employee1> list = new HashSet<>();
	       
        Employee1 e1 = new Employee1("1001","Priya");
        Employee1 e2 = new Employee1("1002","Tejas");
        Employee1 e3 = new Employee1("1003","Ajinkya");
       
        list.add(e1);
        list.add(e2);
        list.add(e3);
       
        System.out.println(list);
	}
}
