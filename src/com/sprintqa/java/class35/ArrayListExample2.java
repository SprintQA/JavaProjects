package com.sprintqa.java.class35;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample2 {
	public static void main(String[] args) {
		int sum = 0;

		// Declaration and creating object of array list class
		List<Integer> numbers = new ArrayList<Integer>();

		// Adding element in array list
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		
		// Getting element from array list
		numbers.get(1);

		
		Iterator<Integer> itr = numbers.iterator();
		
		while (itr.hasNext()) {
			sum = sum + itr.next();
		}
		
		for(int data : numbers) {
			System.out.println(data);
			sum = sum + data;
		}
		
		System.out.println("Sum= " + sum);

	}
}
