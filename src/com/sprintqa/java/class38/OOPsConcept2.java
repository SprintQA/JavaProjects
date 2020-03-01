package com.sprintqa.java.class38;

class Demo {
	// Class contains variable/characteristics/attributes and
	// methods/features/behavior

	String color;
	int sizeOfRAM;
	String modelName;
	
	//Constructor
	Demo(){
		color="white";
		sizeOfRAM = 2;
		modelName = "iphone 4";
	}

	// Method 
	public void call() {
		System.out.println(color);
		System.out.println(sizeOfRAM);
		System.out.println(modelName);
	}

}

public class OOPsConcept2 {
	public static void main(String[] args) {

		Demo d1 = new Demo();
		d1.color = "black";
		d1.sizeOfRAM = 8;
		d1.modelName = "Iphone 7";
//		d1.call();

		Demo d2 = new Demo();
		d2.call();

	}
}
