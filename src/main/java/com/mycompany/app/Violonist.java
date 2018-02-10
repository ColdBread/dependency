package com.mycompany.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Violonist {
	@Autowired
	@Qualifier("violin")
	private Instrument instrument;
	public Violonist(){};
	public Violonist(Instrument instrument){
		this.instrument = instrument;
	}
	
	public void perform() {
		instrument.play();
	}
}
