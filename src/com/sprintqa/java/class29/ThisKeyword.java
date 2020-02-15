package com.sprintqa.java.class29;

class Demo {
	int i=40; // Instance variable

	public void displayValue() {
		int i = 20; // Local variable
		System.out.println(this.i);
	}
}

public class ThisKeyword {

	public static void main(String[] args) {
		Demo d = new Demo();
		Demo d1 = new Demo();

		d.i = 10;
		d1.i = 50;
		
		d1.displayValue();

	}

}
