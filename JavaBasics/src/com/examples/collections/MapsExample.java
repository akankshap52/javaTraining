package com.examples.collections;

import java.util.HashMap;
import java.util.Map;

public class MapsExample {

	  public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Map<Integer,String> hm = new HashMap<>();
	        
	        hm.put(1001, "Java programing");
	        hm.put(1003, "Dot Net");
	        hm.put(1004, "Python");
	        hm.put(1005, "Java programing");
	        System.out.println(hm);
	        for(Map.Entry m : hm.entrySet()){    
	           System.out.println(m.getKey()+" "+m.getValue());    
	           }
	        
	        

	 

	    }

}
