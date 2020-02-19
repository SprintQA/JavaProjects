package com.sprintqa.java.class33;

public class ExceptionExample {
	public static void main(String[] args) {
		int i = 10, j= 0; // normal
		
		String str = null; // normal
		
		System.out.println("Program ends"); // normal
		
		// Checked exception / compile time exception
		Thread.sleep(2000); // critical statement
		
		// It'll throw / zero exception
		// Unchecked exception / Run time exception
		System.out.println(i / j); // critical statement
		
		
		// It can throw null pointer exception
		System.out.println(str.length()); // critical statement
		
		
		
		
		
	
	}
}
