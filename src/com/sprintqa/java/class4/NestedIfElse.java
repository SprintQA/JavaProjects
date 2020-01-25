/* This is program to check eligibility of person for blood donation

This program is developed by SprintQA and all copyrights are reserved */

package com.sprintqa.java.class4;

import java.util.Scanner;

public class NestedIfElse {
	// Write a program to check a person is eligible for blood donation or not based
	// on age and weight

	// if age>18 -> eligible for blood donation
	// if weight>=50 - > they can do blood donation

	public static void main(String args[]) {

		int age, weight, bloodCount = 120;

		// Create object of scanner class
		Scanner sc = new Scanner(System.in);

		// We are getting age input from user
		System.out.println("Please enter your age..");
		age = sc.nextInt();

		// Get weight from user
		System.out.println("Please enter your weight..");
		weight = sc.nextInt();

		// If person age is greater than 18 then check for weight otherwise exit with
		// message
		if (age > 18) {

			if (weight >= 50) { // We need weight is more than 50 to do blood donation

				if (bloodCount > 100) {
					System.out.println("You are eligible and you can donate blood");
				} else {
					System.out.println("You are eligible and you can not donate blood due to blood count");
				}

			} else {
				System.out.println("You are eligible but you can not donate blood due to underweight");
			}
		} else {
			if (age > 15) {
				System.out.print("You are 3 years to go");
			} else {
				System.out.print("You are not eligible");
			}
		}

	}
}
