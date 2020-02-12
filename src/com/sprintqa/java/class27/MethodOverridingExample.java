package com.sprintqa.java.class27;


// Method Overloading - Static polymorphism
// Method Overriding with parent class reference - Dynamic polymorphism
class Parent{
	
	public void displayName() {
		System.out.println("Parent");
	}
	
}


class Child extends Parent{

	public void displayName() {
		System.out.println("Child");
	}
}





public class MethodOverridingExample {
	public static void main(String[] args) {
		Child c = new Child();
		c.displayName();
	}
}
