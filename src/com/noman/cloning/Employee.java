package com.noman.cloning;

public class Employee implements Cloneable {

	JoiningDate joiningDate;
	
	String empId;
	
	float salary;

	public JoiningDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(JoiningDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Employee(JoiningDate joiningDate, String empId, float salary) {
		super();
		this.joiningDate = joiningDate;
		this.empId = empId;
		this.salary = salary;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
