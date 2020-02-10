package com.sprintqa.java.class26;

public class MethodOverLoadingExample {
	
	public static void displayLine() {
		System.out.println("*************************");
	}
	
	public static void displayLine(int length) {
		for (int i = 1; i <= length; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void displayLine(char charToPrint) {
		for (int i = 1; i <= 50; i++) {
			System.out.print(charToPrint);
		}
		System.out.println();
	}
	
	public static void displayLine(int length, char charToPrint) {
		for (int i = 1; i <= length; i++) {
			System.out.print(charToPrint);
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		int num1= 10, num2 = 20;
		
		System.out.println("Addition - "+(num1+num2));
		displayLine(50,'-');
		System.out.println("Sub - "+(num1-num2));
	}
}
