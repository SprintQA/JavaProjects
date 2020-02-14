package com.sprintqa.java.class29;

class Demo2 {
	
	public Demo2() {
//		this("test it");
		this(10,"test it");
		System.out.println("Inside default constructor");
	}

	public Demo2(String message) {
//		this("Demo Program");  // we are calling default constructor
		System.out.println(message);
	}
	
	public Demo2(int a, String b) {
		
	}

	
}

public class ThisKeywordInConstructor {
	int i; // instance variable
	public static void main(String[] args) {
//		this.i = 10; // We can not use this keyword inside static method
		Demo2 d = new Demo2();
	}
}
