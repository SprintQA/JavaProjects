package com.sprintqa.java.class32;

interface Flower{
	public abstract void bloom(String month); 
	public abstract void smell(String quality);
}
class Rose implements Flower{

	String month, quality;
	Rose(){	
		}
	
	public void bloom(String month) {
		System.out.println("Roses bloom in " + r.bloom());
		
	}
	public void smell(String quality) {
		System.out.println("Roses smell "+ r.smell());
		}
	
	
public  class InterfaceMyExample{
	public  void main(String[] args) {
	Rose r = new Rose();
	r.smell("fantastic");
	r.bloom("June");

	}}}