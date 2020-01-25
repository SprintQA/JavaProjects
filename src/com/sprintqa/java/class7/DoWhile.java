package com.sprintqa.java.class7;

public class DoWhile {

	public static void main(String[] args) {

		int i = 11;

		// In case of do while loop if condition is failed at first place still it'll
		// execute do block at least once
		do {
			System.out.println("Hello World!");
			i++;
		} while (i <= 10);

		
		// In case of while loop in below program if condition is failed at first place
		// then it'll not print any output
//		
//		int i = 11; // 1. Initialization
//
//		while (i <= 10) { // 2. Condition
//			System.out.println(i);
//			i++; // Increment or decrement
//		}

	}

}
