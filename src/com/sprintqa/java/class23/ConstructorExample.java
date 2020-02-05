package com.sprintqa.java.class23;

class HSBCAccount {

	// Program - Take pull from the github and write a program to count number of
	// account that we opened from class
//				 HSBCAccount or number of object we have created from class HSBCAccount

	int balance;
	int accountNumber;
	String accountName;
	static int count = 0;

	// Default constructor
	public HSBCAccount() {
		balance = 1000;
		accountName = "xyz";
		accountNumber = 1;
		count++;
	}

	public void withdraw(int amount) {
		balance = balance - amount;
	}

}

public class ConstructorExample {
	public static void main(String[] args) {
		HSBCAccount account1 = new HSBCAccount();

		HSBCAccount account2 = new HSBCAccount();

		HSBCAccount account3 = new HSBCAccount();

		HSBCAccount account4 = new HSBCAccount();

		HSBCAccount account11 = new HSBCAccount();
		HSBCAccount account22 = new HSBCAccount();
		HSBCAccount account33 = new HSBCAccount();
		HSBCAccount account44 = new HSBCAccount();

		System.out.println(account4.count);

	}
}
