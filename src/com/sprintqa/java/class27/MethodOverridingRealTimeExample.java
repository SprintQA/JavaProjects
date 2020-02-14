package com.sprintqa.java.class27;

class Bank2 {
	public void displayInterestRate() {
		System.out.println(4);
	}
}

class HSBC2 extends Bank2 {
	public void displayInterestRate() {
		System.out.println(3.5);
	}
}

class CitiBank2 extends Bank2 {
	public void displayInterestRate() {
		System.out.println(6);
	}
}

class BOA extends Bank2{
	public void displayInterestRate() {
		System.out.println(7);
	}
}

class ATM {
	public void displayRateOfInterest(Bank2 bank) {
		bank.displayInterestRate();
	}
}

public class MethodOverridingRealTimeExample {
	public static void main(String[] args) {
		HSBC2 hsbc = new HSBC2();
		CitiBank2 citiBank = new CitiBank2();
		BOA boa1 = new BOA();
		ATM atm1 = new ATM();
		atm1.displayRateOfInterest(boa1);
	}
}
