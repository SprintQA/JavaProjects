package com.sprintqa.java.class39.polymorphism;

class A  // superclass
{
	int i, j;
	
	A (int a, int b)
	{
		i = a;
		j = b;
	}
	
	void show ()
	{
		System.out.println ("i and j: " + i + " " + j);
	}
	
}

class B extends A // subclass extending superclass
{
	int k;
	B (int a, int b, int c)
	{
		super (a, b);
		k = c;
	}
	
	@Override
	void show ()
	{
		super.show (); // another use of super keyword
		System.out.println ("k: " + k);
	}
}

public class OverridingDemo
{

	public static void main (String[] args)
	{
		B subObj = new B (5, 6, 7);
		subObj.show ();
	}

}
