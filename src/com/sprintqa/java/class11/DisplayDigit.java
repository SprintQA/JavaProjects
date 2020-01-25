package com.sprintqa.java.class11;

import java.util.Scanner;

public class DisplayDigit {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int lastDigit;
		int num1 = sc.nextInt();
		//		num=153
		
	
		while(num1 !=0) {
			lastDigit = num1%10;  // getting last digit from the number
			System.out.println(lastDigit); 
			num1 = num1 / 10;  // remove last digit from number
		}
		
		//  3
		//  5
		//  1
		
		
		
		
		
		
	}
}
