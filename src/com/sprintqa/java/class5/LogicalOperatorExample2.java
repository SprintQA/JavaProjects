package com.sprintqa.java.class5;

public class LogicalOperatorExample2 {

	// Write a program to find greatest number out of three numbers
	public static void main(String args[]) {
		int num1 = 10, num2 = 20, num3 = 15;

		if (num1 > num2 && num1 > num3) { // we first compare first number with number two and three
			System.out.println(num1 + " is greatest");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is greatest");
		} else { // if both above condition is false then remaining number 3 is greatest
			System.out.println(num3 + " is greatest");
		}

	}
}
