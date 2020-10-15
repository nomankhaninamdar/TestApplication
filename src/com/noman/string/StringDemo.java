package com.noman.string;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("test");
		
		String s2= new String ("test");
		
		String s3= "test";
		
		String s4= "test";
		
		System.out.println(s1==s3);
		
		System.out.println(s1==s2);
		
		System.out.println(s1==s4);
		
		System.out.println(s4==s3);

	}

}
