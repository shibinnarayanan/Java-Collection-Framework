package com.svv4.map;

import java.util.HashMap;
import java.util.Map;

public class G_HashmapwithLamdaExprn {
	
	
	//
	
	public static void main(String[] args) {
		
		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100, "Sam");
		hm.put(101, "Tom");
		hm.put(102, "Raj");
		hm.put(103, "Abi");
		
		hm.forEach((k,v)-> System.out.println("key "+k+","+"value"+v));
		
	}
	
	

}
