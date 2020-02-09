package com.sprintqa.java.class26;


class Parent {
	public void displayLine() {
		System.out.println("****************");
	}
	
	public void show() {
		System.out.println("From Parent class");
	}
	
	public void printHello() {
		System.out.println("Hello");
	}
}

class Child extends Parent{
	
	// Overridden method
	public void show() {
		System.out.println("From Child class");
	}
	
	public void printCurrentTime() {
		System.out.println("23.54");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Child c = new Child();
		c.printHello();
	}

}
