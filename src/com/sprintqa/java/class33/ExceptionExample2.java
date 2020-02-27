package com.sprintqa.java.class33;

public class ExceptionExample2 {
	public static void main(String[] args) {
		 // normal stmt
		
		
		
		try {
			int i=10, j=0;
			System.out.println(i / j); // critical statement
		} catch(ArithmeticException e) {
			System.out.println("Invalid input. Cannot divide number with zero");
		}
		
		System.out.println("Program ends");
	}
}
