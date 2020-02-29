package com.sprintqa.java.class38;

class Bank {

	int balance;
	
	Bank(){
		balance=1000;
	}
	
	Bank(int initialBalance){
		balance=initialBalance;
	}

	public void displayBalance() {
		System.out.println(balance);
	}

}

public class Example3 {
	public static void main(String[] args) {
		Bank acc1 = new Bank();
		Bank acc2 = new Bank(20000);
		acc2.displayBalance();
	}
}
