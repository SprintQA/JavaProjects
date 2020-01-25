package com.sprintqa.java.reviewclass;

public class StringExample {
	public static void main(String args[]) {
		String line = "Hello World!";
		String line1 = "How are you?";
		String line2;
		line2 = line + line1;
		int num1 = 10;
		int num2 = 20;
		
//		System.out.println(line2);
		
//		System.out.print(num1+num2+line); // Evolute left to right addition so first it will perform addition of two numbers
										  // then it'll concatinate with String
		
		// 10 + 20 + "Hello world!"
		// 30 + "Hello World"
		// 30HelloWorld
		
		System.out.print(num1+line+num2);
	}
}
