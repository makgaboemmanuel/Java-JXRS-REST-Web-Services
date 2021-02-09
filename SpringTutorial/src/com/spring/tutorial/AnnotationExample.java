package com.spring.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AnnotationExample {

	@Autowired 
	@Qualifier("piano") /*  this will force the injected bean from the bean.xml to be of id piano */
	
	private Instrument instrument;

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	} 
		
	public void playedInstrument() {
		System.out.println( instrument.sound() );
	}
}
