package com.sprintqa.java.class35;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		
		// Declare linked list
		List<Integer> list = new LinkedList<Integer>();
		
		
		// Add Data inside link list
		list.add(3);
		list.add(5);
		list.add(9);
		list.add(0);
		
		
		System.out.println(list.get(3));
	}
}
