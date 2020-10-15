package com.noman.designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Student s1= new Student();
		
		s1.setStudentName("Noman");
		
		s1.setId(1);
		
		List <String> subjects = new ArrayList<String>();
		
		subjects.add("Marathi");
			
		subjects.add("English");
		
		subjects.add("Hindi");
		
		s1.setSubjects(subjects);
		
		Student s2 =(Student) s1.clone();
		
		System.out.println(s2);

	}

}
