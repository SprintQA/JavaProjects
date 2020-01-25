package com.sprintqa.java.class2;

// Write a program to print greater number from two given numbers

public class FindGreaterNumber {
	public static void main(String args[]) {
		int num1 = 400, num2 = 215;
		
		if (num1 > num2) {
			System.out.println(num1 + " is greater and "+num2 +" is smaller");
		} else {
			System.out.println(num2 + " is greater and "+ num1 +" is smaller");
		}
	}
}
