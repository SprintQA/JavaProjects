package com.sprintqa.java.class39.polymorphism;

class C  // superclass
{
	int i, j;
	
	C (int a, int b)
	{
		i = a;
		j = b;
	}
	
	void show ()
	{
		System.out.println ("i and j: " + i + " " + j);
	}
	
}

class D extends C // subclass extending superclass
{
	int k;
	D (int a, int b, int c)
	{
		super (a, b);
		k = c;
	}
	
	void show (String msg)
	{
		System.out.println (msg + k);
	}
}


public class OverloadingDemo
{

	public static void main (String[] args)
	{
		D d = new D (5, 6, 8);
		d.show ("This is k:"); // this will call show () method in D
		d.show (); // this will call the show () method in in C
	}

}
