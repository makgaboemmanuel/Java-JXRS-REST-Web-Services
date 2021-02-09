package com.spring.tutorial;

public class ConstructorExample {

	private int id; 
	private String name;
	public ConstructorExample(int id, String name) {
		/* super(); please find out for me what does super() mean in java */

		this.id = id;
		this.name = name;

	}
	
	public void show() {
		System.out.println("Name: " + name + ", Id: " + id);
	}
	 
	public static void main(String [] args0) {
		
		ConstructorExample cexample = new ConstructorExample(64, "Emmanuel");
		cexample.show();
	}
	
}
