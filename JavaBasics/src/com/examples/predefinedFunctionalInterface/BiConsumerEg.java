package com.examples.predefinedFunctionalInterface;

import java.util.*;
import java.util.function.BiConsumer;

class Employee{
    String name;
    Integer salary;
    
        
    public Employee(String name, Integer salary) {
        super();
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + "]";
    }
    
}
public class BiConsumerEg {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee("Akanksha",1000));
        emps.add(new Employee("Poorva",2000));
        emps.add(new Employee("Ajinkya",500));
        
        BiConsumer<Employee,Integer> bic = (emp, bonus) -> emp.salary=emp.salary+bonus;
        
        for(Employee e : emps) {
            bic.accept(e, 1000);
        }
        
        for(Employee e: emps) {
            System.out.println(e);
        }

 

    }

 

}
 