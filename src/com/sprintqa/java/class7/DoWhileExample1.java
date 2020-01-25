package com.sprintqa.java.class7;

import java.util.Scanner;

public class DoWhileExample1 {
	public static void main(String[] args) {
		int num1 = 10, num2 = 20, choice, userChoice;

		do {
		System.out.println("Please enter operation to perform");
		System.out.println("1 for add");
		System.out.println("2 for sub");
		System.out.println("3 for mul");
		System.out.println("4 for div");

		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("Addition"+(num1 + num2));
			break;
		case 2:
			System.out.println("sub"+(num1 - num2));
			break;
		case 3:
			System.out.println("mul"+(num1 * num2));
			break;
		case 4:
			System.out.println("div"+(num1 / num2));
			break;
		default:
			System.out.println("Please enter number from 1 to 4 only");
		}
		
		System.out.println("Do you want to try one more time? (1 for yes/2 for no) -");
		userChoice = sc.nextInt();
		
	 }while(userChoice==1);
		
		System.out.println("Good bye....");
	}
}
