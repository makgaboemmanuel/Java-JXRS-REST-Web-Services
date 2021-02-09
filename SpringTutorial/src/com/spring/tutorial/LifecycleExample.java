package com.spring.tutorial;

public class LifecycleExample {

	private String name;

	public void onInitiation() {
		System.out.println("LifeCycle Bean is initialised");
	}
	
	public void getName() {
		System.out.println("The name is:  " + name);
	}

	public void setName(String name) {
		this.name = name;
	} 
	
	public void onDestroy() {
		System.out.println("Lifecycle Bean is destroyed");
	}
	
}
