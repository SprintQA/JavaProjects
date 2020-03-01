package com.sprintqa.java.class38;

public class PrintTable {

	// Write a program to print table of given number into output
	public static void main(String[] args) {
		int number = 5;

		for (int i = 1; i <= 10; i++) {
			System.out.println(number + "*" + i+"="+number*i);
		}

//		Output

//		5 * 1 = 5
//		5 * 2 = 10
//		5 * 3 = 15
//		...
//		5 * 10 = 50		

	}
}
