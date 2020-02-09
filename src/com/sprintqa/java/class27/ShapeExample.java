package com.sprintqa.java.class27;


// Write a program to create three class Triangle, Circle and Shape - Shape will be parent class of Tri, Circle

// Override method of Shape class into child class Triangle and Circle

// Create object of each class in main method and call overridden method 

// Take reference of parent class and create object of child class and call method of child/parent class

class Shape{
	public void displayShape(){
		System.out.println("Displaying Shape");
	}
	public void shapeMethod() {
		System.out.println("inside shape method");
	}
}

class Circle extends Shape{
	public void displayShape(){
		System.out.println("Displaying Circle");
	}
	public void circleMethod() {
		System.out.println("in Circle class method");
	}
}

class Triangle extends Shape{
	public void displayShape(){
		System.out.println("Displaying Triangle");
	}
	public void triangleMethod() {
		
	}
}


public class ShapeExample {
	public static void main(String[] args) {
		Shape cr = new Circle();
		
		Circle cr1 = new Shape(); // We cannot use reference of child class with object of parent class
		cr.displayShape(); // it'll call method of circle class
		cr.shapeMethod();  // it'll call method of Shape class
		cr.circleMethod(); // It'll give you error because shape remote doens't have method circleMethod
		
		
//		Triangle tr = new Triangle();
//		tr.displayShape();
//		tr.triangleMethod();
//		tr.shapeMethod();
		
//		Circle c = new Circle();
//		c.displayShape();
//		c.circleMethod();
//		c.shapeMethod();
		
		
		
//		Shape s = new Shape();
//		s.displayShape();
//		s.shapeMethod();
	}
}
