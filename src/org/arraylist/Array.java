package org.arraylist;

import java.util.*;

public class Array {
	
	public static void main(String[] args) {
		
		List<Integer> l=new LinkedList<>();
		List<Integer> l1=new LinkedList<>();
		
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		
	
	
	    
		int size = l.size();
		System.out.println(size);
		
	    int indexof = l.indexOf(10);
	    System.out.println(indexof);
		
	    
	    int lastindexof = l.lastIndexOf(10);
	    System.out.println(lastindexof);
	    
	   
	    
	    int get = l.get(2);
	    System.out.println(get);
		
	    boolean contains = l.contains(20);
	    System.out.println(contains);
	    
	   l1.retainAll(l);
	   System.out.println(l1);
	   
	   l1.add(20);
	   System.out.println(l1);
	   
	   l.removeAll(l1);
	   System.out.println(l);
	   
	   l.remove(2);
	   System.out.println(l);
	   
		l.set(10, 100);
		System.out.println(l);
	   
	   // index value to get 
	   
		for(int i=0;i<=l.size();i++)
			
		{
			if (l.get(i)==10)
			{
				System.out.println(i);
			}
		}
	    
		
	}
	
	
	

}
