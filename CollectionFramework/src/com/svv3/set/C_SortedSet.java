package com.svv3.set;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class C_SortedSet {
	
	public static void main(String[] args) {
		
		SortedSet<String> set = new TreeSet();
		set.add("Ram");
		set.add("Sam");
		set.add("Xin");
		set.add("Ben");
		set.add("Ram");
		set.add("Tom");
		set.add("Abi");
		
		Iterator<String> itr = set.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	

}
