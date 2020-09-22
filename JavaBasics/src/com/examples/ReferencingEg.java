package com.examples;

class Test{
    public static void test1() {
        System.out.println("Inside the test1 of Test Class");
    }
    public void test2() {
        System.out.println("Inside the non static method test2 ot Test Class");
    }
    
}
class NSEIT{
    String name;
    public NSEIT(String name) {
        this.name=name;
    }
    public String toString() {
        return name;
    }
}

 

interface NseInterface{
    public NSEIT get(String name);
}
public class ReferencingEg {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Runnable r = ()->System.out.println("Inside the thread class....");
        
        Runnable r1 = Test::test1;
        Thread t = new Thread(r1);          //Method referencing
        t.start();
        
        //NseInterface nse = str->  new NSEIT(str);
        
        NseInterface nse = NSEIT::new;  // constructor referencing
        NSEIT n1 = nse.get("Sourab");
        NSEIT n2 = nse.get("Mounika");
        System.out.println(n1);
        System.out.println(n2);
        
        

 

    }

 

}