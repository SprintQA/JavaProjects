package com.sprintqa.java.class23;

class HSBCAccount {

	int balance;
	int accountNumber;
	String accountName;
static int displayaccount;

	// Default constructor
	public HSBCAccount() {
		balance = 1000;
		accountName = "xyz";
		accountNumber = 1;
		
	}

	public void withdraw(int amount) {
		balance = balance - amount;
	}

}

public class ConstructorExample_MFU {
	public static void main(String[] args) {
		HSBCAccount account1 = new HSBCAccount();
		account1.displayaccount++;
		HSBCAccount account2 = new HSBCAccount();
		account2.displayaccount++;
		HSBCAccount account3 = new HSBCAccount();
		account3.displayaccount++;
		HSBCAccount account4 = new HSBCAccount();
		account4.displayaccount++;
		
		System.out.println(account4.displayaccount);
		
	}
}
