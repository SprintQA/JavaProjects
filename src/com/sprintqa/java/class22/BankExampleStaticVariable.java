package com.sprintqa.java.class22;

class BankAccount{
	static int custCount=0;
	int balance;
	int accountNumber;
	String accountName;
	
	
	public void checkBalance() {
		System.out.println(balance);
	}
	
	public void withdraw(int amount) {
		
	}
	
	public void deposit(int amount) {
		
	}
	
	public static int getCustomerCount() {
		return custCount;
	}
	
	public static int getBalance() {
		return custCount;
	}
	
}

public class BankExampleStaticVariable {

	public static void main(String[] args) {
		BankAccount cust1 = new BankAccount();
		
	
		
		cust1.balance = 1000;
		cust1.accountName = "xyz";
		cust1.accountNumber = BankAccount.custCount;
		
		BankAccount cust2 = new BankAccount();
		
		BankAccount.custCount++;
		cust2.balance = 2000;
		cust2.accountName = "abc";
		cust2.accountNumber = BankAccount.custCount;
		
		BankAccount.getCustomerCount();
		
		

	}
}
