package com.sprintqa.java.class32;

interface Shape {
	public void draw();
}

abstract class Demo1{
	public abstract void move();
}

class Circle extends Demo1 implements Shape {

	@Override
	public void draw() {	
		System.out.println("Drawing circle");
	}

	@Override
	public void move() {
		
	}

}

class Triangle implements Shape{
	@Override
	public void draw() {
		System.out.println("Drawing triangle");
	}
}

public class InterfaceExample2 {

}
