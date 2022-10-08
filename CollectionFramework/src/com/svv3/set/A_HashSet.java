package com.svv3.set;

import java.util.HashSet;
import java.util.Iterator;

public class A_HashSet {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet();
		hashSet.add("Sam");
		hashSet.add("Ram");
		hashSet.add("Sam");
		hashSet.add("Tom");
		hashSet.add("Xin");
		hashSet.add(null);
		hashSet.add(null);

		Iterator<String> itr = hashSet.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}