package com.sprintqa.java.class28;

class Student {
	private String name;
	private int rollNumber;

	// Setter
	public void setName(String nameFromOutsideClass) {
		
		
		name = nameFromOutsideClass;
	}

	// Getter
	public String getName() {
		return name;
	}

}

class Bank {
	private int balance;

	public int getBalance() {
		
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}

public class Encapsulation {

	public static void main(String[] args) {
		Student s = new Student();

//		s.name = "ABC";
		s.setName("ABC"); // Writing data into class Student and variable name
		System.out.println(s.getName()); // Reading data from class Student

		Bank b = new Bank();
		b.balance = 20000000; // Invalid, we have to use setters and getters
		
		b.setBalance(20000000);

	}

}
