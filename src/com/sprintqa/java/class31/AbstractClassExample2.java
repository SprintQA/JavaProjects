package com.sprintqa.java.class31;

// Abstract class
abstract class Phone {
	// Abstract class can have conctructor and it'll get call when we create object of child class
	public Phone() {
		System.out.println("From  abstract class phone");
	}
	
	private String os;

	// Abstract method
	// Abstract method cannot be final
	// final - we are restricting user from overriding this method
	// abstract - we are forcefully instructing user to override this method
	abstract public void call();

	final public void displayConfig() {
		System.out.println("Operation system- " + os);
	}

	// Concrete method
	public void setOS(String os) {
		this.os = os;
	}

	// Concrete method
	public String getOS() {
		return os;
	}
}

// Concrete class
class Iphone extends Phone {
	public void call() {
		System.out.println("Calling from Iphone");
	}
}

//Concrete class
class SamsungPhone extends Phone {

	public void call() {
		System.out.println("Calling from Samsumg");
	}
}

public class AbstractClassExample2 {
	public static void main(String[] args) {
		Iphone iPhone7 = new Iphone();
		SamsungPhone galaxy = new SamsungPhone();
		iPhone7.setOS("OSX");
		galaxy.setOS("Android");

		galaxy.displayConfig();

	}
}
