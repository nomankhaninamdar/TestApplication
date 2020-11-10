package com.noman.designpatterns.abstractfactory;

public class PersonFactory {
	
	public static Person getPerson(AbstarctPersonFactory factory) {
		
		return factory.getPerson();
	}

}
