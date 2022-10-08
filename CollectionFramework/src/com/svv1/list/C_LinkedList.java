package com.svv1.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class C_LinkedList {
	
	public static void main(String[] args) {
		
		LinkedList<String> linkList =new LinkedList<>(); 
		linkList.add("Sam"); 
		linkList.add("Tom");  
		linkList.add("Ravi");  
		linkList.add("Ajay"); 
		linkList.add(null); 
		linkList.add("Ajay"); 
		
		Iterator<String> itr = linkList.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
	}

}
