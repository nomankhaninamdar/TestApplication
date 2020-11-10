package com.noman.java8.functionalinterfaces;

import java.util.List;

public class Employee {
	
	 String name ;
	
	 int id;
	 
	 int salary;
	 
	 String dept;
	
	public String getDept() {
		return dept;
	}

	public Employee(String name, int id, int salary, String dept) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.dept = dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee(String name, int id,int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary=salary;
	}

	

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	


	

	

}
