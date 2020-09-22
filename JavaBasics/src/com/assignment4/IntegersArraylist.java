package com.assignment4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntegersArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		  List l=new ArrayList();
          System.out.println("Enter the input");
          Scanner input=new Scanner(System.in);

           String a =input.nextLine();
           l.add(a);
           System.out.println(l);
          
          
//           for (int i = 0 ; i< l.size(); i=i+3) {
//        	   l.remove(i);
//           }
//           
//           System.out.println(l);
           while (l.size() > 0) {
        	   l.remove(count) ;
        	   count = count +3 ;
           }
           System.out.println(l);
	}

}
