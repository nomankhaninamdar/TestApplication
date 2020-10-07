package com.noman.cloning;

public class Student implements Cloneable {

	
	private String studentName;
	
	private int rollNo;
	
	 JoiningDate colegeJoiningDate;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public JoiningDate getColegeJoiningDate() {
		return colegeJoiningDate;
	}

	public void setColegeJoiningDate(JoiningDate colegeJoiningDate) {
		this.colegeJoiningDate = colegeJoiningDate;
	}

	public Student(String studentName, int rollNo, JoiningDate colegeJoiningDate) {
		super();
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.colegeJoiningDate = colegeJoiningDate;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student s = (Student)super.clone();
		s.setColegeJoiningDate(new JoiningDate(getColegeJoiningDate().getDay(), getColegeJoiningDate().getMonth(), getColegeJoiningDate().getYear()));
	    return s;
	}
	
	
	
	
}
