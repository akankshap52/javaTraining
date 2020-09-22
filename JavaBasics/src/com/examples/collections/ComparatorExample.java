package com.examples.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product{
    Integer id;
    String name;
    String category;
    public Product(Integer id, String name, String category) {
        super();
        this.id = id;
        this.name = name;
        this.category = category;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", category=" + category + "]";
    }
   
}
//class ProductName implements Comparator<Product>{          // not reqd for Comparator using lambda expression
//
//	 
//
//    @Override
//    public int compare(Product p1, Product p2) {
//        // TODO Auto-generated method stub
//        
//        if(p1.getName().compareTo(p2.getName())<1)
//            return -1;
//        else if(p1.getName().compareTo(p2.getName())>1)
//            return 1;
//        else
//            return 0;
//    }
//    
//}
class ProductCat implements Comparator<Product>{
    @Override
    public int compare(Product p1, Product p2) {
        // TODO Auto-generated method stub
       
        if(p1.getCategory().compareTo(p2.getCategory())<1)
            return -1;
        else if(p1.getCategory().compareTo(p2.getCategory())>1)
            return 1;
        else
            return 0;
    }
}
class ProductId implements Comparator<Product>{
    @Override
    public int compare(Product p1, Product p2) {
        // TODO Auto-generated method stub
       
        if(p1.getId().compareTo(p2.getId())<1)
            return -1;
        else if(p1.getId().compareTo(p2.getId())>1)
            return 1;
        else
            return 0;
    }
}
public class ComparatorExample {

	public static void main(String[] args) {

	        // TODO Auto-generated method stub
	        Product p1 = new Product(1001,"Lg mobile","Electronics");
	        Product p2 = new Product(3210,"Raymond Cloth","Clothing");
	        Product p3 = new Product(4531,"Cerelac Oats","Provisions");
	        Product p4 = new Product(2001,"Nivea","Cosmetics");
	        ArrayList<Product> ar = new ArrayList<>();
	        ar.add(p1);
	        ar.add(p2);
	        ar.add(p3);
	        ar.add(p4);
//	        ProductName pr = new ProductName();
	        ProductCat cr = new ProductCat();
	        ProductId id = new ProductId();
	        
	        Comparator<Product>  pr = (p6,p7)-> (p1.getName().compareTo(p2.getName()));  //Comparator using lambda expression
	        
	        System.out.println("Sorted basis on Product Name.");
	        Collections.sort(ar, pr);
	        System.out.println(ar);
	        System.out.println("Sorted basis on Product Category");
	        Collections.sort(ar, cr);
	        System.out.println(ar);
	        System.out.println("Sorted basis on Product ID");
	        Collections.sort(ar, id);
	        System.out.println(ar);
	        
	        
	        
	    }

	 

	}


