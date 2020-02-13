package com.sprintqa.java.class27;

class Bank1 {
	public void displayInterestRate() {
		System.out.println(4);
	}
}

class HSBC1 extends Bank1 {
	public void displayInterestRate() {
		System.out.println(3.5);
	}
}

class CitiBank1 extends Bank1 {
	public void displayInterestRate() {
		System.out.println(6);
	}
}

public class DynamicBinding {

	public static void main(String[] args) {
		Bank1 b1;
		b1 = new HSBC1();
		b1.displayInterestRate();  // 3.5
		
		b1 = new CitiBank1();
		b1.displayInterestRate(); // 6
		
	}

}
