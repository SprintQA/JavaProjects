package com.sprintqa.java.class3;

import java.util.Scanner;

public class LadderIfElse2 {
	public static void main(String args[]) {
		// Write a program to get input from user and perform operation (add,sub etc) based on user input
		
		int num1 = 10, num2 = 20;
		
		System.out.println("Please enter operation to perform");
		System.out.println("1 for add");
		System.out.println("2 for sub");
		System.out.println("3 for mul");
		System.out.println("4 for div");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		if (choice == 1) {
			System.out.println(num1 + num2);
			
		} else if (choice == 2) {
			System.out.println(num1 - num2);
			
		} else if (choice == 3) {
			System.out.println(num1 * num2);
			
		} else if (choice == 4) {
			System.out.println(num1 / num2);
		} else {
			System.out.println("Enter valid input from  1 to 4 only");
		}
		
		
		
	}
}
