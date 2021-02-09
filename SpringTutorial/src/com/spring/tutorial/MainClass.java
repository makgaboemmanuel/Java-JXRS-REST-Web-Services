package com.spring.tutorial;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AbstractApplicationContext appcontext = new ClassPathXmlApplicationContext("beans.xml");
		HelloSpring helloSpring = (HelloSpring) appcontext
				.getBean("helloSpring"); /* this method receives the class id */
		System.out.println(helloSpring.getMessage());

		/* Constructor Injection */
		SpringConstructorInjection injconstructor = (SpringConstructorInjection) appcontext
				.getBean("constructorInjection");
		/* this method receives the class id */
		injconstructor.showInjectedValues();

		/*
		 * by default if you don't mention the bean scope, it is a singleton - meaning
		 * it will be instantiated once for the entire session.
		 */

		SpringMessage springMessage = (SpringMessage) appcontext.getBean("springMessage"); // SpringMessage
		springMessage.setSpringMessage("Message from first object.");
		springMessage.getSpringMessage();

		SpringMessage springMessages = (SpringMessage) appcontext.getBean("springMessage"); // SpringMessage
		springMessages.setSpringMessage("Message from second object."); /*
																		 * you always have to instantiate the object
																		 * every time you call a method
																		 */
		springMessages.getSpringMessage();

		/* Bean Life Cycle Example */

		LifecycleExample lifecycleExample = (LifecycleExample) appcontext.getBean("lifecycleExample"); // SpringMessage
		lifecycleExample.setName(
				"Life Cycle Example."); /*
										 * you always have to instantiate the object every time you call a method
										 */
		lifecycleExample.getName();

		/* SetterInjectionExample */

		SetterInjectionExample setterInjection = (SetterInjectionExample) appcontext.getBean("setterInjectionExample"); // SpringMessage
		System.out.println("ID is: "
				+ setterInjection.getId()); /*
											 * you always have to instantiate the object every time you call a method
											 */
		System.out.println("Name is: " + setterInjection.getName());

		/* Injecting a Bean into Another bean */

		/* playInstru */

		/*
		 * PlaysInstrument playIns = (PlaysInstrument)
		 * appcontext.getBean("playInstrument"); / playIns.playedInstrument();
		 * 
		 * PlaysInstrument playInss = (PlaysInstrument)
		 * appcontext.getBean("playInstru"); playInss.playedInstrument();
		 */

		/* injecting the collections */

		CollectionExample injCollections = (CollectionExample) appcontext.getBean("collectionExample");
		System.out.println(injCollections.getIntegerList());
		System.out.println(injCollections.getIntegerSet()); /* sets does not allow duplicates */
		System.out.println(injCollections.getMap());

		/* autowire byName or byType */
		PlaysInstrument playIns = (PlaysInstrument) appcontext.getBean("ment");
		playIns.playedInstrument();

		
		/* autowire by annotation */
		
		AnnotationExample annotation = (AnnotationExample) appcontext.getBean("annotations");
		annotation.playedInstrument();

		/*  AOP Example  */
		AOPExample aopExample = (AOPExample) appcontext.getBean("aopexample");
		aopExample.showValues();
		
		appcontext.close();// registerShutdownHook(); /* to destroy beans */
	}

}
