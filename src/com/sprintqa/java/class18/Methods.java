package com.sprintqa.java.class18;

public class Methods {

	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		System.out.println("Hello Wolrd!");
		printLine('*',10);			// Method call
		System.out.println("addition" + (num1 + num2));
		printLine('=',50);	
		System.out.println("sub" + (num1 - num2));
		printLine('-',30);	
		System.out.println("mul" + num1 * num2);
		printLine('#',5);	
		System.out.println("div" + num1 / num2);
	}
	
	
	// Defination
	public static void printLine(char patternChar, int limit) {
		for(int i=0; i<limit; i++) {
			System.out.print(patternChar);
		}
		
		System.out.println();
	}
	
	// Write a def of function to do sum of two numbers
	
//	public / private / protected / default
//	[access specifier][return type] [method_name](){
	
	
//	}

}
