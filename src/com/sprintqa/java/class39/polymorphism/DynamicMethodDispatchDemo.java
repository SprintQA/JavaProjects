package com.sprintqa.java.class39.polymorphism;

class E // superclass
{
	void callme ()
	{
		System.out.println ("Inside E's callme method");
	}
}

class F extends E // subclass extending superclass
{
	void callme ()
	{
		System.out.println ("Inside F's callme method");
	}
}

class G extends E  // subclass extending superclass
{
	void callme ()
	{
		System.out.println ("Inside G's callme method");
	}
}


public class DynamicMethodDispatchDemo
{

	public static void main (String[] args)
	{
		E e = new E();
		F f = new F();
		G g = new G();
		
		E r; // r is reference to E class
		r = e; // r refers to E's object
		r.callme (); // calls the E's version of callme() method
		
		r = f; // r refers to F's object
		r.callme (); // calls the F's version of callme() method
		
		r = g; // r refers to G's object
		r.callme (); // calls the G's version of callme() method
		
		e.callme ();
	
	}

}
