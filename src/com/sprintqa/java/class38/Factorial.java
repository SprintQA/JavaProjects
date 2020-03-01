package com.sprintqa.java.class38;

public class Factorial {
//	Write a program to find factorial of given number
	public static void main(String[] args) {
//		fact(5) = 5*4*3*2*1

		int number = 3, fact=1;
		
		for(int i=1; i<=number;i++) {
			fact=fact*i;
		}
		
		System.out.println("Factorial="+fact);
		
		

	}
}
