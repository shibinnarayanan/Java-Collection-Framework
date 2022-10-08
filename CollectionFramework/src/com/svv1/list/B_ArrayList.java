package com.svv1.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class B_ArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<>();//Creating arraylist  
		list.add("Sam");//Adding object in arraylist  
		list.add("Tom");  
		list.add("Ravi");  
		list.add("Ajay"); 
		list.add(null); 
		list.add("Ajay"); 
		list.add(null); 
		
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
	
	}

}
