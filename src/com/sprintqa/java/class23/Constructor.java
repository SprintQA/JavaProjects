package com.sprintqa.java.class23;

class Animal {
	String color; // Object variable
	int numberOfLegs; // Object variable

//	public Animal() { // Default Constructor
//
//	}

	public Animal() { // User Defined Constructor
		color = "White";
		numberOfLegs = 2;
	}

	public void fly() {
		System.out.println("2.Fly");
	}

}

public class Constructor {

	public static void main(String[] args) {

		Animal a1 = new Animal();
		Animal a2 = new Animal();
		Animal a3 = new Animal();		
		
		System.out.println(a1.numberOfLegs);
	}}