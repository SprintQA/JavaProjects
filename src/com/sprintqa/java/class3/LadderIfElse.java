package com.sprintqa.java.class3;

import java.util.Scanner;

public class LadderIfElse {

	// Write a program to print given day of week
	// 1 = Monday
	// 2 = Tuesday
	// 3 = Wednesday
	// 7 = Sunday

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number (1-7)");
		int num =sc.nextInt();

		if (num == 1) {
			System.out.print("Monday");
		} else if (num == 2) {
			System.out.print("Tuesday");
		} else if (num == 3) {
			System.out.print("Wed");
		} else if (num == 4) {
			System.out.print("Thursday");
		} else if (num == 5) {
			System.out.print("Fri");
		} else if (num == 6) {
			System.out.print("Sat");
		} else if (num == 7) {
			System.out.print("Sun");
		} else {
			System.out.print("Plesae try again and enter number between 1 to 7 only");
		}
	}
}
