package com.svv4.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//iterator is an interface used for iterate over a collection.
//we cannot iterate over map directly using iterators, because Map interface is not the part of Collection.
//so need to convert map to collection then use iterator

public class E_TraverseMapUsingIterator {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();  
	      hm.put(100,"Sam");    
	      hm.put(101,"Tom");    
	      hm.put(102,"Raj");  
	      hm.put(103,"Abi");  
	      
	      Set<Integer> set = hm.keySet();
	      
	      Iterator<Integer> itr = set.iterator();
	      
	      while (itr.hasNext()) {
			
	    	  int key = (int)itr.next();
	    	  
	    	  String value = hm.get(key);
	    	  
	    	  System.out.println("Key-> "+key+" Value-> "+value);
		}
		
	}

}
