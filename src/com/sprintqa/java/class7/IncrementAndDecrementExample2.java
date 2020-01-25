package com.sprintqa.java.class7;

public class IncrementAndDecrementExample2 {
	public static void main(String[] args) {
		int num1 =7;
		int num2;
		
		
		// postfix - first assign value to the variable and then do increment
//		num2 = num1++;
//		System.out.println(num2);
//		System.out.println(num1);
		
		
		// prefix - first do increment and then assign value to the variable
		num2 = ++num1;
		System.out.println(num2);
		System.out.println(num1);
		
		
		
	}
}
