package com.noman.designpatterns.prototype;

import java.util.List;

public class Student implements Cloneable{

	private String studentName;
	
	private int id;
	
	private List<String> subjects;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", id=" + id + ", subjects=" + subjects + "]";
	}

	
	
	
	
}
