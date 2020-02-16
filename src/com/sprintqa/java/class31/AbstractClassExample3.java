package com.sprintqa.java.class31;

abstract class Bank{
	int balance;
	static int numberOfBank;
	
	Bank(){
		numberOfBank++;
	}
	
	public static void displayNumberOfBank() {
		System.out.println("Number of bank  - "+numberOfBank);
	}
	
	
	abstract public void displayRateOfInterest();
	abstract public void openAccount();
	
	public void withdraw(int amount) {
		balance = balance - amount;
	}
	
}

class HSBC extends Bank{
	public void displayRateOfInterest() {
		System.out.println("6");
	}

	@Override
	public void openAccount() {
		System.out.println("Account opened in HSBC Bank");
		
	}
}

class BankOfAmerica extends Bank{
	public void displayRateOfInterest() {
		System.out.println("3.5");
	}
	
	@Override
	public void openAccount() {
		System.out.println("Account opened in Bank of America Bank");
		
	}
}

public class AbstractClassExample3 {
	public static void main(String[] args) {
		Bank b = new HSBC();
		HSBC hsbc = new HSBC();
		b.displayRateOfInterest();
		b.withdraw(100);
		Bank.displayNumberOfBank();
	}

}
