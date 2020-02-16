package com.sprintqa.java.class32;

interface Vehical1 {

	// By default all variable inside interface are final and static
	final static int a = 10; // Instance variable? No

	// By default all methods inside interface are abstract

	public abstract void show(); // Method declaration
	public abstract void displayLine();
	public abstract void anotherMethod();
}

interface SportsCar{
	void race();
	void run();
}

public class Car1 implements Vehical1, SportsCar {

	@Override
	public void show() {

	}

	@Override
	public void displayLine() {

	}

	@Override
	public void anotherMethod() {

	}

	@Override
	public void race() {
		
	}

	@Override
	public void run() {
		
	}

}
