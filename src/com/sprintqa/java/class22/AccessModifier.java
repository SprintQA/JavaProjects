package com.sprintqa.java.class22;

class BankAccount3 {
	
	// Encapsulation
	
	// private - within a class only 
	// public -  everywhere 
	// default - access inside package only 
	// Protected - 
	
	
	protected int balance;
	int accountNumber;
	String accountName;

	public void checkBalance() {
		// if user is not identified then don't show the balance
		System.out.println(balance);
	}

	public void withdraw(int amount) {
		balance = balance - amount;
	}

	public void deposit(int amount) {
		balance = balance + amount;
	}
	
	public void setBalance(int userInputtedBalance) {
			balance = userInputtedBalance;
	}

}

public class AccessModifier {
	public static void main(String[] args) {
		BankAccount3 cust1 = new BankAccount3();
		cust1.checkBalance();
		cust1.setBalance(999);
		cust1.checkBalance();
	}

}
