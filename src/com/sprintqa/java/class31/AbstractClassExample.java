package com.sprintqa.java.class31;

abstract class Shape1 { // Abstract class
	
	//Abstract method without body
	abstract public void draw(); 
}

class Circle1 extends Shape1{

	
	
	// Overridden method from parent class
	@Override
	public void draw() {
		System.out.println("Drawing circle");
	}
	
}

class Triangle  extends Shape1{
	
	// Overridden method from parent class
	public void draw() {
		System.out.println("Drawing Triangle");
	}
}

public class AbstractClassExample {
	public static void main(String[] args) {
		
		// We cannot create object of abstract class
		Shape1 s = new Shape1();
		s.draw();
//		
//		
	}
}
