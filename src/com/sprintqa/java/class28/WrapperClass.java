package com.sprintqa.java.class28;




public class WrapperClass {
	public static void main(String[] args) {
		String num1 = "10", num2 = "20";
		
		int k = Integer.parseInt(num1);
		int l = Integer.parseInt(num2);
		System.out.println(k+l);
		
		 // primitive data types
		double d = 10.9;
		Double d1 = new Double(10.0);
		
		
		
		int i=10;
		Integer i1 = new Integer(i);  // boxing / wrapping
		
		int j;
		Integer j1;
		j1 = 20;                     // Autoboxing / autowrapping
		
		
		i = i1.intValue();  // unboxing / unwrapping
		j = j1;             // AutoUnboxing / AutoUnwrapping 
		
		
		
		
		
		System.out.println(d1.intValue());
//		System.out.println(i1==i);
		
		
	}
}
