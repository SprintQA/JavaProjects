package com.sprintqa.java.class23;

class Vehical {
	int maxSpeed; // Object variable
	static int numberOfCC; // Class variable

	public void race() {
		System.out.println(maxSpeed);
	}
	
	public static void printCC() {
		System.out.println(numberOfCC);
	}
}

public class TypesOfVariable {

	public static void main(String[] args) {
		int a=10;
		Vehical v1 = new Vehical();
		Vehical v2 = new Vehical();
		Vehical v3 = new Vehical();
		
		v3.maxSpeed = 100;
		v2.maxSpeed = 200;
		v1.maxSpeed = 150;
		v1.maxSpeed = 300;
		
		v1.numberOfCC = 100;  // Vehical.numberOfCC = 100
		v2.numberOfCC = 200;  // Vehical.numberOfCC = 200
		v3.numberOfCC = 600;  // Vehical.numberOfCC = 600

		Vehical.printCC();
		
	}

}
