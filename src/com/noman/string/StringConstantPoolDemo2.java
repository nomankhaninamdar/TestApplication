package com.noman.string;

public class StringConstantPoolDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "test";
		
		String s2= s1.toString();
		
		String s3= s2.toLowerCase();
		
		String s4= s3.toUpperCase();
		
		
		System.out.println(s1==s2);
		
		
		System.out.println(s1==s3);
		
		System.out.println(s1==s4);

		
		
		String s11= new String ("test");
		
		String s12= s11.toLowerCase();
		
		
		System.out.println(s11==s12);
		
		//System.out.println("s11:"+s11);
	}

}
