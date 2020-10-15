package com.noman.string;

public class StringConstantPoolDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1= new String ("You can not change me");
		
		String s2= new String ("You can not change me");
		
		System.out.println(s1==s2);
		
		String s3= "You can not change me";
		
		String s4= "You can not change me";
		
		System.out.println(s1==s3);
		
		System.out.println(s1==s4);
		
		System.out.println(s2==s3);
		
		System.out.println(s2==s4);
		
		
		String s5= "You can not" +" change me";
		
		System.out.println(s4==s5);
		
		String s6= "You can not";
		
		String s7= s6+" change me";
		
		System.out.println(s4==s7);
		
		final String s8=  "You can not";
		
		String s9= s8+" change me";
		
		System.out.println(s4==s9);
	}

}
