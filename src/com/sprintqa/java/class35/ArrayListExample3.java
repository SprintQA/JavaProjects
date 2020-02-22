package com.sprintqa.java.class35;

import java.util.ArrayList;
import java.util.Iterator;

// Add 5 numbers inside array list and print all even numbers from array list

public class ArrayListExample3 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(10); 
		numbers.add(15);
		numbers.add(20);
		numbers.add(25);
		numbers.add(8);
		
		Iterator<Integer> itr = numbers.iterator();
		

		while (itr.hasNext()) {
			if (itr.next() % 2 == 0) {
				System.out.println(itr.next());
			}
		}
		
		
		
		

//		for (int data : numbers) {
//			if (data % 2 == 0) {
//				System.out.println(data);
//			}
//		}

	}
}
