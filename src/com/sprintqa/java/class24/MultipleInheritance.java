package com.sprintqa.java.class24;


class A{
	public void displayLine() {
		System.out.println("***************");
	}
}

class B extends A {
	public void displayLine() {
		System.out.println("###############");
	}
}

class C extends B{
	
}


public class MultipleInheritance {

	public static void main(String[] args) {
		C c1 = new C();
		c1.displayLine();

	}

}
