package com.spring.tutorial;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeAdviseExample implements MethodBeforeAdvice {

	public void before( Method arg0, Object[] agr1, Object arg2 ) throws Throwable {
		System.out.println("Before Advise... ");
	}
	
}
