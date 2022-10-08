package com.svv1.list;

import java.util.Iterator;
import java.util.Vector;

public class D_Vector {
	
	public static void main(String[] args) {
		
		Vector<String> vec = new Vector();
		vec.add("Sam");
		vec.add("Ram");
		vec.add("Tom");
		
		Iterator<String> itr = vec.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	} 

}
