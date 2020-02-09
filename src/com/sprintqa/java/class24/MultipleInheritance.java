package com.sprintqa.java.class24;

class A {
	public void displayLine() {
		System.out.println("***************");
	}
}

class B {
	public void displayLine() {
		System.out.println("***************");
	}
}

class C extends A// , B
{

}

public class MultipleInheritance {

	public static void main(String[] args) {
		C c1 = new C();
		c1.displayLine();
	}

}
