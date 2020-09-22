package com.assignment4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class EmpValidationHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Map<Integer,String> hm = new HashMap<>();
        
        hm.put(1001, "Ravi");
        hm.put(1003, "bharaT");
        hm.put(1004, "sheetal");
        hm.put(1005, "shanU");
        System.out.println(hm);
        ArrayList<String> arr = new ArrayList<>();
        for(Map.Entry m : hm.entrySet()){  
        	String first = m.getValue().toString();
        	boolean f = Character.isLowerCase(first.charAt(0));
        	boolean l = Character.isUpperCase(first.charAt(first.length()-1) );
//           System.out.println(f);
//           System.out.println(l + "--------------------------");
           if(f && l) {
        	   arr.add(first);
           }
           
           }
        System.out.println(arr);
	}

}
