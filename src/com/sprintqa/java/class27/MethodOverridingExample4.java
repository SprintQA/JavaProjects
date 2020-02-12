package com.sprintqa.java.class27;

class Banks {
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


class YesBank extends Banks {
	public double getInterestRate() {
		return 6.0;
	}
	
	public void onlineTransfer() {
		System.out.println("transferring online");
	}
}

public class MethodOverridingExample4 {
	public static void main(String[] args) {
		
		Banks yesBank = new YesBank();
		
		System.out.println(yesBank.getInterestRate());
		yesBank.deposit();
		yesBank.onlineTransfer();
		

	}
}
