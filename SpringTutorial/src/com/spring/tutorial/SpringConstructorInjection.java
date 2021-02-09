package com.spring.tutorial;

public class SpringConstructorInjection {

	private int id; 
	private String name;
	
	public SpringConstructorInjection(int id, String name) {
		/* super(); please find out for me what does super() mean in java */

		this.id = id;
		this.name = name;

	}
	
	public void showInjectedValues() {
		System.out.println("Name: " + name + ", Id: " + id);
	} 
	
}
