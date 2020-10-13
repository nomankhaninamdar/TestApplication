package com.noman.designpatterns.builder;

public class Person {

	private String firstName;
	
	private String lastName;
	
	private int age;
	
	private String gender;
	
	private boolean maritalStatus;
	
	private String spouseName;
	
    public Person(String firstName, String lastName, int age, String gender, boolean maritalStatus, String spouseName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.spouseName = spouseName;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", gender=" + gender
				+ ", maritalStatus=" + maritalStatus + ", spouseName=" + spouseName + "]";
	}

	 
    
    
}
