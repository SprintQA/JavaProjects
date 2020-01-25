package com.sprintqa.java.class3;

public class Practice {
	// Write a program to check given year is leap year or not
	
	// Leap year - Leap year is a year which comes in a 4 year
	
	public static void main(String args[]) {
		int year = 2020;
		
		if(year % 4 ==0) {
			System.out.print("Given year is leap year");
		}else {
			System.out.print("Given year is not leap year");
		}
		
	}
}
