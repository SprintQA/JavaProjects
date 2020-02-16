package com.sprintqa.java.class31;

final class Parent1  {
	final String messageFromParentClass = "From Base Class"; // constant
	
	private final double PI = 3.14;
	
	final int nuberOfdayInWeek = 7;
	
	 final String str = "hello";

	public final void displayMsg() {
		System.out.println(nuberOfdayInWeek);
	}
}

class Child1 {



}

public class FinalExample {
	public static void main(String[] args) {
		Parent1 p = new Parent1();
		System.out.println(p.str);
	}

}
