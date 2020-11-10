package com.noman.designpatterns.abstractfactory;

public class PeonFactory extends AbstarctPersonFactory {

	@Override
	public Person getPerson() {
		// TODO Auto-generated method stub
		return new Peon();
	}

}
