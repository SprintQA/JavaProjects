package com.sprintqa.java.class35;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		int numbers[] = new int[10]; // Fixed size

		numbers[0] = 10; // store data in array
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;

		numbers[5] = numbers[4];
		numbers[4] = numbers[3];
		numbers[3] = 60;

		ArrayList<Integer> al = new ArrayList<Integer>(); // Declare arraylist

		al.add(10); // Store data inside array list  // 0 
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);  
		
		// Store data at 3rd postion
		al.add(3, 60);
		
		
		Iterator<Integer> itr = al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next()); // 10 30 40
			itr.next();  
		}
		
		
		
		
		// sizeOfArray = positionOfLastIndex + 1

		

//		System.out.println(numbers.length);
//		System.out.println(al.size());
		
		
		// Index based for loop
//		for (int i = 0; i < al.size(); i++) {
//			System.out.println(al.get(i));
//		}
		
		// enhance for loop
//		for(int number : numbers) {
//			System.out.println(number);
//		}
		
		

	}

}
