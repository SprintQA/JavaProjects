package com.sprintqa.java.class38;

class Phone {
	// Class contains variable/characteristics/attributes and
	// methods/features/behavior

	String color;
	int sizeOfRAM;
	String modelName;

	public void call(String number) {
		System.out.println("calling from.." + modelName + " which is ram " + sizeOfRAM);
	}

	public void text(String text, String number) {

	}
}

public class OOPsConcept {
	public static void main(String[] args) {
		
		Phone p1 = new Phone();
		p1.color = "black";
		p1.sizeOfRAM = 8;
		p1.modelName = "Iphone 7";

		Phone p2 = new Phone();
		p1.call("90834567");

	}
}
