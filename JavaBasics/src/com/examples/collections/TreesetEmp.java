package com.examples.collections;


import java.util.TreeSet;

class Employee2 implements Comparable<Employee2>{
    String empid;
    String empname;
    String locn;
    @Override
    public String toString() {
        return "Employee [empid=" + empid + ", empname=" + empname + " , locn=" + locn +"]";
    }
    public Employee2(String empid, String empname , String locn) {
        super();
        this.empid = empid;
        this.empname = empname;
        this.locn = locn;
    }
    public String getLocn() {
		return locn;
	}
	public void setLocn(String locn) {
		this.locn = locn;
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
	@Override
	public int compareTo(Employee2 obj) {
        // TODO Auto-generated method stub
        if(this.locn.compareTo(obj.getLocn())==0)
                return 0;
        else if(this.locn.compareTo(obj.getLocn())>0)
            return 1;
        else
            return -1;
    }
	}
public class TreesetEmp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   TreeSet<Employee2> list = new TreeSet<>();
	       
        Employee2 e1 = new Employee2("1001","Priya","Dombivli");
        Employee2 e2 = new Employee2("1002","Tejas","Mulund");
        Employee2 e3 = new Employee2("1003","Ajinkya","Powai");
        Employee2 e4 = new Employee2("1004","Poorva","Airoli");
        Employee2 e5 = new Employee2("1005","Sudhanshu","Kalwa");
        Employee2 e6 = new Employee2("1006","Akanksha","Thane");
       
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
       
        System.out.println(list);
	}
}
