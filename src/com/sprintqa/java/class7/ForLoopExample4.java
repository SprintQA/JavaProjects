package com.sprintqa.java.class7;

public class ForLoopExample4 {
	public static void main(String[] args) {

		// Program to print 1 to 10

		// Write a program to print all number from 1 to 20 that is divisible by 4

		// output - 4 8 12 16 20

		for (int i = 1; i <= 20; i++) {
			if (i % 4 == 0) {
				System.out.println(i);
			}
		}
	}
}
