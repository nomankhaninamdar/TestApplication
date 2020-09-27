package com.noman.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int rollNo;
	
	private String name;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String [] args) throws IOException, ClassNotFoundException
	{
		Student s = new Student();
		s.setName("Noman");
		s.setRollNo(31);
		
		
		FileOutputStream fos = new FileOutputStream("d:/student.txt");
		
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		
		oos.writeObject(s);
		
		oos.close();
		fos.close();
		
		
		FileInputStream fis = new FileInputStream("d:/student.txt");
		
		ObjectInputStream ois= new ObjectInputStream(fis);
		
		Student s1 = (Student)ois.readObject();
		
		System.out.println("s1.rollno:"+s1.getRollNo());
		
		System.out.println("s1.name:"+s1.getName());

		
	}
	
}
