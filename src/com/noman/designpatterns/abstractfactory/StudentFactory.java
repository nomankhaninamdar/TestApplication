package com.noman.designpatterns.abstractfactory;

public class StudentFactory extends AbstarctPersonFactory {

	@Override
	public Person getPerson() {
		// TODO Auto-generated method stub
		return new Student();
	}

}
