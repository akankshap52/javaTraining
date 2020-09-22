package com.examples.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

class MenuItems implements Comparable<MenuItems>{
	String item ;
	Integer cost ;
	
	  @Override
	    public String toString() {
	        return " {item=" + item + ", cost=" + cost + "}";
	    }
	

	public MenuItems(String item , Integer cost) {
		super();
		this.item = item;
		this.cost = cost;
		// TODO Auto-generated constructor stub
	}
	
	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}


	@Override
	public int compareTo(MenuItems obj) {
	     if(this.cost.compareTo(obj.getCost())==0)
             return 0;
     else if(this.cost.compareTo(obj.getCost())>0)
         return 1;
     else
         return -1;
 }
	}

public class SortObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<MenuItems> list = new ArrayList<>();
		
		MenuItems i1 = new MenuItems("Cakes" , 200);
		MenuItems i2 = new MenuItems("Chocolates" , 50);
		MenuItems i3 = new MenuItems("Donuts" , 90);
		MenuItems i4 = new MenuItems("Brownies" , 120);
		MenuItems i5 = new MenuItems("Cupcakes" , 70);
		
		
		list.add(i1);
		list.add(i2);
		list.add(i3);
		list.add(i4);
		list.add(i5);
	Collections.sort(list);
		System.out.println(list);

	}

}
