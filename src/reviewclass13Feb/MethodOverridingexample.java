package com.sprintqa.java.reviewclass13Feb;

class A {
	public void display() {
		System.out.println("Methods from parent class");
	}
}

class B extends A {
	

}

public class MethodOverridingexample {
	public static void main(String[] args) {
		 A a1 = new A();
		 B b1 = new B();
		 A a2 = new B(); // we are creating child class object
		 B b2 = new A();
		
		 
//		 a1.display(); // parent
//		 a2.display(); // child 
//		 b1.display(); // child
		 b2.display(); // error
		 
		 a2.display();
	}
	
}
