package com.svv1.list;

import java.util.Iterator;
import java.util.Stack;

public class E_Stack {
	
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack();
		
		stack.push("Sam");
		stack.push("Ram");
		stack.push("Abi");
		stack.push("Tom");
		
		stack.pop(); //removes the last element
		
//		.peek - Looks at the object at the top of this stack without removing itfrom the stack
		System.out.println("Peek -> " + stack.peek());

		
		Iterator<String> itr = stack.iterator();
		
		System.out.println("Iteration result");
		
		while (itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		
		
	}

}
