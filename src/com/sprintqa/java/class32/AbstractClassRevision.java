package com.sprintqa.java.class32;

// Non abstract or concrete class
class Demo{
	public void show() {
		
	}
}

abstract class AbstractDemo{
	abstract void anotherMethod();
}

abstract class Parent{
	int a; // instance variable?
	
	Parent(){
		
	}
	
	public void show() {
		
	}
	
	//Abstract method never be a final or static
	abstract void display();

	
	// Concrete method can be a final or static
	public static void method1() {
		System.out.println("Parent class method");
	}
}

class Child extends Parent {


	public static void method1() {
		System.out.println("Child class method");
	}


	@Override
	void display() {
		
	}

}

public class AbstractClassRevision {
	public static void main(String[] args) {
		Parent p = new Child();
		Child.method1();
		Parent.method1();
		p.display();
	}
}
