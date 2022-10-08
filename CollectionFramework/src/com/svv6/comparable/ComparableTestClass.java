package com.svv6.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTestClass {
	
	public static void main(String[] args) {
		
		List<Student> stdList =new ArrayList();
		
		stdList.add(new Student(4,"Kim"));
		
		stdList.add(new Student(3,"Ram"));
		stdList.add(new Student(1,"Sam"));
		stdList.add(new Student(2,"Tom"));
		stdList.add(new Student(7,"Abi"));
		stdList.add(new Student(5,"Son"));
		stdList.add(new Student(6,"Xin"));
		
		System.out.println("Initial List \n");
		stdList.forEach(std->System.out.println(std)); //lambda exprn
		
		Collections.sort(stdList);
		System.out.println("\nAfter sorting by apply comparable\n");
		//stdList.forEach(std->System.out.println(std));
		stdList.forEach(System.out::println); // method reference ********************************
		
		
		/*
		 * Here, you don't actually need the name x in order to invoke println for each
		 * of the elements. That's where the method reference is helpful - the ::
		 * operator denotes you will be invoking the println method with a parameter,
		 * which name you don't specify explicitly:
		 */		
	}

}
