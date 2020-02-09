package com.sprintqa.java.class23;

class HSBCAccount {

	int balance;
	int accountNumber;
	String accountName;
<<<<<<< HEAD
  static int count=0;
=======
	static int count=0;

>>>>>>> e091283f91a447cefc59a868718fa7d6180b7b94
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
		
		System.out.println(HSBCAccount.count);
<<<<<<< HEAD
		
	}
=======
			}
>>>>>>> e091283f91a447cefc59a868718fa7d6180b7b94
}
