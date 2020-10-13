package com.noman.designpatterns.builder;

public class PersonBuilder {

	private String firstName;
	
	private String lastName;
	
	private int age;
	
	private String gender;
	
	private boolean maritalStatus;
	
	private String spouseName;

	public PersonBuilder setFirstName(String firstName) {
		this.firstName = firstName;
		
		return this;
	}

	public PersonBuilder setLastName(String lastName) {
		this.lastName = lastName;
		
		return this;
	}

	public PersonBuilder setAge(int age) {
		this.age = age;
		
		return this;
	}

	public PersonBuilder setGender(String gender) {
		this.gender = gender;
		
		return this;
	}

	public PersonBuilder setMaritalStatus(boolean maritalStatus) {
		this.maritalStatus = maritalStatus;
		
		return this;
	}

	public PersonBuilder setSpouseName(String spouseName) {
		this.spouseName = spouseName;
		
		return this;
	}
	
	public Person build() {
		return new Person(firstName, lastName, age, gender, maritalStatus, spouseName);
	}
	

}
