package com.svv2.que;

import java.util.Iterator;
import java.util.PriorityQueue;

public class A_PriorityQueue {

	public static void main(String[] args) {

		PriorityQueue<String> prioQue = new PriorityQueue();

		prioQue.add("Tom");
		prioQue.add("Sam");
		prioQue.add("Zen");
		prioQue.add("Abi");
		prioQue.add("Xin");
		prioQue.add("Xin");

		System.out.println("Iterating elements\n");

		Iterator<String> itr1 = prioQue.iterator();

		while (itr1.hasNext()) {

			System.out.println(itr1.next());

		}
		System.out.println("\n");

		//.element() Retrieves, but does not remove, the head of this queue
		System.out.println("Head - " + prioQue.element());
		//.poll() Retrieves and removes the head of this queue,or returns null if this queue is
		// empty
		System.out.println("Head - " + prioQue.poll());

		System.out.println("\nIterating after poll \n");

		Iterator<String> itr2 = prioQue.iterator();

		while (itr2.hasNext()) {

			System.out.println(itr2.next());

		}
		
		prioQue.remove(); //Retrieves and removes the head of this queue.This method differs from poll only in that it throws an exception if this queue is empty. 
		prioQue.poll(); //Retrieves and removes the head of this queue,or returns null if this queue is empty.

		
		System.out.println("\nIterating after remove and poll \n");
		
		Iterator<String> itr3 = prioQue.iterator();

		while (itr3.hasNext()) {

			System.out.println(itr3.next());

		}
	}

}
