package com.noman.designpatterns.abstractfactory;

public class TeacherFactory extends AbstarctPersonFactory {

	@Override
	public Person getPerson() {
		// TODO Auto-generated method stub
		return new Teacher();
	}

}
