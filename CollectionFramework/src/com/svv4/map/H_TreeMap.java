package com.svv4.map;

import java.util.Map;
import java.util.TreeMap;

public class H_TreeMap {
	

	public static void main(String[] args) {
		
		Map<Integer,String> tmap = new TreeMap<Integer,String>();
		
		tmap.put(1,"Tom");
		tmap.put(3,"Ram");
		tmap.put(6,"San");
		tmap.put(4,"Xin");
		tmap.put(2,"Son");
		tmap.put(9,"Abi");
		
		System.out.println(tmap);
		
		tmap.forEach((a,b)->System.out.println(a +"->"+ b));
	}
	

}
