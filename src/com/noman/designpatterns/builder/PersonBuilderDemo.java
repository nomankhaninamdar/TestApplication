package com.noman.designpatterns.builder;

public class PersonBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new PersonBuilder().setAge(22).setFirstName("Noman").setMaritalStatus(true).build();
		
		System.out.println(person);
	}

}
