package com.mycompany.app;

import org.springframework.stereotype.Component;

@Component("violin")
public class Violin implements Instrument {
	public Violin(){}
	public void play() {
		System.out.println("Play violin");

	}

}
