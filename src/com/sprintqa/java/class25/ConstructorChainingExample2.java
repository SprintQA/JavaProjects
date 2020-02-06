package com.sprintqa.java.class25;

class A {
	A() {
		System.out.println("1. From class A");
	}
}

class B extends A {
	B() {
		super();
		System.out.println("2. From class B");
	}

}

class C extends B {
	C() {
		super();
		System.out.println("3. From class C");
	}
}

public class ConstructorChainingExample2 {
	public static void main(String[] args) {
//		B b1 = new B();
//		A a1 = new A();
		C c1 = new C();
	}
}
