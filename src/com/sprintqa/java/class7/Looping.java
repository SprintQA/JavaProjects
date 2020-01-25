package com.sprintqa.java.class7;

public class Looping {

	public static void main(String[] args) {

		// Write a program to print Hello World into separate line 1500 times into
		// console output
		// System.out.println("Hello World!");

		int i = 1; // 1. Initialization

		while (i <= 10) { // 2. Condition
			System.out.println("Hello World!");
			i++; // Increment / decrement
		}

		System.out.println("Value of i= " + i);

		System.out.print("End of program.....");

	}
}
