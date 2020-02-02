package com.sprintqa.java.class22;

class BankAccount1 {
	static int custCount = 0;
	int balance;

	public static void displayCustCount() {
		System.out.println(custCount);
	}
	
	public void displayBalance() {
		System.out.println(balance);
		System.out.println(custCount);
	}

}

public class StaticMethods {

	public static void main(String[] args) {
		BankAccount1.custCount++;
//		BankAccount1.displayCustCount();
		
		BankAccount1 cus1 = new BankAccount1();
		cus1.balance = 1000;
		cus1.displayBalance();
		
		BankAccount1 cus2 = new BankAccount1();
		BankAccount1.custCount++;
		cus2.balance = 2000;
		cus2.displayBalance();
	}

}
