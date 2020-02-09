package com.sprintqa.java.class24;

<<<<<<< HEAD

class A{
=======
class A {
>>>>>>> 674c98c673abca6c6e14776ad71cce4f8398d229
	public void displayLine() {
		System.out.println("***************");
	}
}

class B extends A {
	public void displayLine() {
		System.out.println("###############");
	}
}

<<<<<<< HEAD
class C extends B{
	
}
=======
class C extends A// , B
{
>>>>>>> 674c98c673abca6c6e14776ad71cce4f8398d229

}

public class MultipleInheritance {

	public static void main(String[] args) {
		C c1 = new C();
		c1.displayLine();

	}

}
