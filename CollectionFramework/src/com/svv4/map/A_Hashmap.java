package com.svv4.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A_Hashmap {
	
	public static void main(String[] args) {
		
		Map<Integer,String> hashmap = new HashMap();
		
		hashmap.put(1,"Ram");
		
		hashmap.put(2,"Tom");
		hashmap.put(3,"Sam");
		hashmap.put(4,"Abi");
		
		//New method
		
		for(Map.Entry m: hashmap.entrySet() )
		{
			System.out.println("key "+m.getKey()+", value "+m.getValue());
		}
		
//		//Old method
//		//Traversing Map  
//		Set set = hashmap.entrySet();//converting map to set so that we can traverse
//		
//		Iterator itr = set.iterator();
//		
//		while (itr.hasNext()) {
//
//			Map.Entry entry=(Map.Entry)itr.next();  
//	        System.out.println(entry.getKey()+" "+entry.getValue());  
//		}
	}

}
