package com.sprintqa.java.class33;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample3 {

	public static void main(String[] args) {
		String choice;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first number ");
			try {
				int i = sc.nextInt(); // critical
				System.out.println("Enter second number ");
				int j = sc.nextInt(); // critical
				System.out.println(i / j); // critical
				

		}catch (InputMismatchException e) {
				System.out.println("Please enter int data only....");
			} catch (ArithmeticException e) {
				System.out.println("Invalid input...can not divide number with zero");
			}

			System.out.println("Want to try one more time(Yes/No)?");
			choice = sc.next();
			System.out.println(choice);
		} while (choice.equals("Yes"));
		System.out.println("program end");

	}

}
