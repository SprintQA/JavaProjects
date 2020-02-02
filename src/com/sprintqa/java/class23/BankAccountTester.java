package com.sprintqa.java.class23;

class BankAccount {

	int balance;
	int accountNumber;
	String accountName;

	

	// Paramterized constructor
	public BankAccount(String name, int initialBalance, int userAccountNumber) {
		balance = initialBalance;
		accountName = name;
		accountNumber = userAccountNumber;
	}

	public void withdraw(int amount) {
		balance = balance - amount;
	}

	public void deposit(int amount) {
		balance = balance + amount;
	}
}

public class BankAccountTester {

	public static void main(String[] args) {
		BankAccount cust1 = new BankAccount("Chirag",3,1000);
		BankAccount cust2 = new BankAccount("ABC", 5000, 4); // prevent to create account with default data
		
		System.out.println(cust1.accountName);
		System.out.println(cust1.accountNumber);
		System.out.println(cust1.balance);
		
		System.out.println(cust2.accountName);

	}

}
