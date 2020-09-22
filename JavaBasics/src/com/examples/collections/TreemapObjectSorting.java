package com.examples.collections;


import java.util.Map;
import java.util.TreeMap;

class Book2 implements Comparable<Book2>{
    int id;
    String name, author, publisher;
    int quantity;

    public Book2(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int compareTo(Book2 obj) {
		// TODO Auto-generated method stub
		 if(this.publisher.compareTo(obj.getPublisher())==0)
             return 0;
     else if(this.publisher.compareTo(obj.getPublisher())>0)
         return -1;
     else
         return 1;
	}
}
  
public class TreemapObjectSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
		        // TODO Auto-generated method stub
		         Map<Book2,Integer> map=new TreeMap<Book2,Integer>();    
		            //Creating Books    
		            Book2 b1=new Book2(101,"Let us C","Yashwant Kanetkar","BPB",8);    
		            Book2 b2=new Book2(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
		            Book2 b3=new Book2(103,"Operating System","Galvin","Wiley",6);    
		            //Adding Books to map 
		            map.put(b3,3); 
		            map.put(b1,1);  
		            map.put(b2,2);  
		            
		              
		            //Traversing map  
		            for(Map.Entry<Book2,Integer> entry:map.entrySet()){    
		                int key=entry.getValue();
		                Book2 b=entry.getKey();  
		                System.out.println(key+" Details:");  
		                System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
		            }    


		    }

		

	}


