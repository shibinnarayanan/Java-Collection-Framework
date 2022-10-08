package com.svv4.map;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class B_MapSortingUsingStreamApi {

	public static void main(String[] args) {
		
		MapSorting.sortAsc();
		MapSorting.sortDesc();
	}

}
//comparingByKey

class MapSorting {

	public static void sortAsc() {

		Map<Integer, String> hashmap = new HashMap();

		hashmap.put(8, "Ram");
		hashmap.put(2, "Tom");
		hashmap.put(6, "Sam");
		hashmap.put(4, "Abi");
		hashmap.put(1, "Abi");
		hashmap.put(5, null);
		
		System.out.println("Ascending order sorting \n");

		hashmap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

	}
	public static void sortDesc() {

		Map<Integer, String> hashmap = new HashMap();

		hashmap.put(8, "Ram");
		hashmap.put(2, "Tom");
		hashmap.put(6, "Sam");
		hashmap.put(4, "Abi");
		hashmap.put(1, "Abi");
		hashmap.put(5, null);
		
		System.out.println("\nAscending order sorting \n");

		hashmap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);

	}
}
