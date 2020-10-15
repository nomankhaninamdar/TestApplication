package com.noman.collection.hash;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1= new Employee();
		
		Employee e2=new Employee();
		
		
		HashMap<Employee, String>  hm = new HashMap<Employee, String>();
		
		hm.put(e1, "noman");
		hm.put(e2,"noman");
		
		System.out.println("Size of hashmap:"+ hm.size());
	}

}
