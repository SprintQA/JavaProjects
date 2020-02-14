package com.sprintqa.java.class29;

class Bank {

	public void testMethod() {
		System.out.println("test");
		testMethod();
	}
	
	
	public Bank(){
	}

}

public class ThiKeywordExample2 {
	public static void main(String[] args) {
		Bank b = new Bank();
		b.testMethod();
	}

}
