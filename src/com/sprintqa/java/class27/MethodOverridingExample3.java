package com.sprintqa.java.class27;

class Bank {
	public void deposit() {
		System.out.println("deposit");
	}
	public void withdraw() {
		System.out.println("withdraw");
	}
	public double getInterestRate() {
		return 4.0;
	}
}

class BankOperation{
	
}

class BankOfAmerica extends Bank {
	public double getInterestRate() {
		return 3.0;
	}
}

class HSBC extends Bank {
	public double getInterestRate() {
		return 3.5;
	}
}

class CitiBank extends Bank {
	public double getInterestRate() {
		return 6.0;
	}
}

public class MethodOverridingExample3 {
	public static void main(String[] args) {
		
		
		
		CitiBank citi = new CitiBank();
		BankOfAmerica ba = new BankOfAmerica();
		HSBC hsbc = new HSBC();
		
		Bank citi1 = new CitiBank();
		
		
		System.out.println(citi.getInterestRate()); // city bank - 6.0
		System.out.println(ba.getInterestRate());  // bank of america - 3.0
		System.out.println(hsbc.getInterestRate()); // hsbc - 3.5
		System.out.println(citi1.getInterestRate());
		

	}
}
