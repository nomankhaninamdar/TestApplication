package com.noman.test;

import java.util.HashMap;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, Integer>hm= new HashMap<Integer, Integer>();
		hm.put(1, 1);
		myMethod(hm);
		hm.put(2,2); 
		System.out.println(hm.size());
	}

	public static void myMethod(HashMap hm)
	{
		hm=null;
	}
}
