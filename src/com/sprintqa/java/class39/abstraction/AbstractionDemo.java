package com.sprintqa.java.class39.abstraction;

abstract class Shape // superclass
{
	// abstract method
	abstract double calculateArea(); // method signature
	
	// an implemented method
	void print ()
	{
		System.out.println ("This is a shape.");
	}
}

class Rectangle extends Shape
{
	private double width;
	private double length;
	
	// setter methods
	void setWidth (double width)
	{
		this.width = width;
	}
	
	void setLength (double length)
	{
		this.length = length;
	}
	
	// getter methods
	double getWidth()
	{
		return width;
	}
	
	double getLength()
	{
		return length;
	}
	
	// how we use setters inside class constructor to update the values of instance variables
	Rectangle (double width, double length)
	{
		setWidth(width);
		setLength(length);
	}
	
	// implement the abstract the method in subclass
	@Override
	double calculateArea ()
	{
		return width * length;
	}
	
}

public class AbstractionDemo
{

	public static void main (String[] args)
	{
		Shape rectangle = new Rectangle(10, 15);
		rectangle.print ();
		System.out.println (rectangle.calculateArea ());

	}

}
