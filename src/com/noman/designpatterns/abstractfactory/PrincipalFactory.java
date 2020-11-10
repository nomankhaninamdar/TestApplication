package com.noman.designpatterns.abstractfactory;

public class PrincipalFactory extends AbstarctPersonFactory{


	@Override
	public Person getPerson() {
		// TODO Auto-generated method stub
		return new Principal();
	}

	
}
