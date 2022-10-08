package com.svv7.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTestClass {
	
	public static void main(String[] args) {
		
		List<Student> stdList =new ArrayList();
		
		stdList.add(new Student(4,"Kim"));
		
		stdList.add(new Student(3,"Ram"));
		stdList.add(new Student(1,"Sam"));
		stdList.add(new Student(1,"Anu"));
		stdList.add(new Student(2,"Tom"));
		stdList.add(new Student(7,"Abi"));
		stdList.add(new Student(5,"Son"));
		stdList.add(new Student(6,"Xin"));
		
		System.out.println("Initial List \n");
		stdList.forEach(std->System.out.println(std));
		
		Collections.sort(stdList,new NameComparator());
		System.out.println("\nAfter sorting by apply Name comparator\n");
		stdList.forEach(std->System.out.println(std));
		
		Collections.sort(stdList, new IdComparator());
		System.out.println("\nAfter sorting by apply Id comparator\n");
		stdList.forEach(std->System.out.println(std));
		
	}

}
