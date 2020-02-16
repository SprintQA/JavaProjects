package com.sprintqa.java.class29;

class Bank1 {

	// How to call two constructor from a constructor
	public void testMethod() {
		//System.out.println("test");
		
	}

	public Bank1() {
	this(10,20);	
				
	}

	public Bank1(String test) {
		
		System.out.println("String test");
	 
	}
	
	public Bank1(int a, int b) {
		this("Test it");
		System.out.println("Int test");

	}

}

public class ThiKeywordHwExample {
	public static void main(String[] args) {
		Bank1 b = new Bank1();
		b.testMethod();
	}

}
