package com.svv4.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class F_TraverseMapUsingEntryInterface {

	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100, "Sam");
		hm.put(101, "Tom");
		hm.put(102, "Raj");
		hm.put(103, "Abi");

		for (Map.Entry<Integer,String> entry : hm.entrySet()) //using map.entrySet() for iteration  
		{  
		//returns keys and values respectively  
		System.out.println("Key: " + entry.getKey() + ", Name: " + entry.getValue());   
		} 
	}

}
