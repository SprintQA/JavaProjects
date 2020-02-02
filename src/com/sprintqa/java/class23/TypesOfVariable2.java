package com.sprintqa.java.class23;

class Vehical1 {
	int maxSpeed; // Object variable

	public void race() {
		System.out.println(maxSpeed);
	}

}

public class TypesOfVariable2 {

	public static void main(String[] args) {
		int a=0;
		Vehical1 v1 = new Vehical1();
		Vehical1 v2 = new Vehical1();
		Vehical1 v3 = new Vehical1();
		System.out.println(a);
		System.out.println(v1.maxSpeed);
	}

}
