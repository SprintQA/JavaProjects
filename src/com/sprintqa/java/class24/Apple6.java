package com.sprintqa.java.class24;
public class Apple6 {
	
	public int price(int x) {
		System.out.println("Apple6 costs $" +x);
		return x;
	}
	}
	class Apple8 extends Apple6{
	public int price(int x) {
		System.out.println("Apple8 costs $" +x);
		return x;		
	}
		public static void main(String []args) {
		Apple6 a = new Apple6();
		Apple8 b = new Apple8();
		a.price(1000);
		b.price(a.price(0)+500);
	}}