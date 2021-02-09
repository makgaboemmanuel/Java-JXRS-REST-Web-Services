package com.spring.tutorial;

public class PlaysInstrument {

	Instrument instrument;
	
	/*  no constructor allowed in: autowire  */
	
	/* PlaysInstrument(Instrument instrument  ){
		this.instrument = instrument; 
	} */ 
	
	 public void playedInstrument() {
		System.out.println(instrument.sound());
	}  

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	 
}
