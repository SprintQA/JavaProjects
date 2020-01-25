package com.sprintqa.java.class12;

public class FindLargestNumber_HW {

	// Write a program to print largest number from array
	
	public static void main(String[] args) {
		int numbers[] = { 10, 35, 67, 89, 45, 10, 40 , 60, 58, 7}, maxNumber=0, minNumber=0;
		
		// largest number - 89
		
		maxNumber = numbers[0];
		for(int i=0; i<numbers.length;i++) {
			if(numbers[i]>maxNumber) {
				maxNumber = numbers[i];
			}
		}
		
		System.out.println("Largest number is "+maxNumber);
		
		// Smallest number - 7
		minNumber = numbers[0];
		for(int i=0; i<numbers.length;i++) {
			if(numbers[i]<minNumber) {
				minNumber = numbers[i];
			}
		}
		
		System.out.println("Smallest number is "+minNumber);
		
		
	}

}
