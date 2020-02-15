package com.sprintqa.java.class29;

class Demo1 {

	int i;
	char lineChar;

	public void displayValue() {
		this.displayLine();
		System.out.println(i);
	}

	public void displayLine() {
		System.out.println(lineChar);
	}

}

public class ThisKeywordInMethod {

	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.lineChar = '*';
		d.displayValue();
	}

}
