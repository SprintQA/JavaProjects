package com.sprintqa.java.class35;

class Box<T,S> {
	private T a;
	private S storeString;

	public void setMyData(T dataFromUser) {
		a = dataFromUser;
	}

	public T getMyData() {
		return a;
	}
}

public class GenericOverview {
	public static void main(String[] args) {

		Box<String, Integer> stringBox = new Box<String,Integer>();
		stringBox.setMyData("Hello");
		System.out.println(stringBox.getMyData());

		Box<Integer> intBox = new Box<Integer>();
		intBox.setMyData(10);
		System.out.println(intBox.getMyData());
	}
}
