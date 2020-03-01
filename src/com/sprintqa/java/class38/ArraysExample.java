package com.sprintqa.java.class38;

public class ArraysExample {
	public static void main(String[] args) {

		// Declaration of array
		int marks[] = new int[5];
		
		
		int numbers[] = {40,43,55,34,32};
		
//		marks
//		index    value
//		0   	42
//		1  		0
//		2  		38
//		3  		0
//		4  		40
		
		
		
		// Storing value inside array
		marks[0] = 42;
		marks[2] = 38;
		marks[4] = 40;
		
		// Traversing array
		for(int i=0; i<marks.length; i++) {
			System.out.println(marks[i]);
		}
		
		System.out.println("====2nd Array out====");
		for(int temp : numbers) {
			System.out.println(temp);
		}
		
		
	}
}
