package com.noman.designpatterns.abstractfactory;

public class PersonFactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person student = PersonFactory.getPerson(new StudentFactory() );
		
		Person principal = PersonFactory.getPerson(new PrincipalFactory());
		
		Person teacher = PersonFactory.getPerson(new TeacherFactory());
		
		Person peon = PersonFactory.getPerson(new PeonFactory());
		
		System.out.println(peon.getDetails());

	}

}
