package com.sprintqa.java.class31;

class Shape {
	int i = 10;

	public void draw() {
		System.out.println("11");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
	}
}

class Circle extends Shape {
//	int i = 20;

	public void draw() {
//		int i = 30;
//		super.draw();
		System.out.println(i); // Local variable
		System.out.println(this.i); // Instance variable
		System.out.println(super.i); // Instance var of super class
	}
}

public class ExampleOfSuperWithMethod {
	public static void main(String[] args) {
		Circle c = new Circle();
		Shape s = new Shape();
		c.draw();
//		s.draw();
	}
}
