package com.noman.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TransientDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Employee e= new Employee();
		
		e.seteName("Noman");
		
		e.setId(2);
		
		FileOutputStream fos = new FileOutputStream("d:/Employee.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(e);
		
		
		FileInputStream fis = new FileInputStream("d:/Employee.txt");
		
		ObjectInputStream ois= new ObjectInputStream(fis);
		
		Employee e1 =(Employee)ois.readObject();
		
		System.out.println(e1.getId());
		
		System.out.println(e1.geteName());
		
		
		
		

	}

}
