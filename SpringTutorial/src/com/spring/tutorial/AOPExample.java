package com.spring.tutorial;

public class AOPExample {
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void showValues() {
		System.out.println("Name is: " + name + ", ID is: " + id); 
	}
}
