package com.sprintqa.java.class28;


class A{
	public void show() {
		System.out.println("From class A");
	}
}

class B extends A{
	
	public void show() {
		System.out.println("From class B");
	}
	
	public void xyz() {
		System.out.println("From xyz");
	}
}

public class MethodOverridingRevisionn {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		A a1 = new B(); // Parent class ref with child class obj
		B b1 = new A(); 
//		a1.show();
//		a1.xyz();  // It'll give you error
//		b1.xyz();  // output?
	}
}
