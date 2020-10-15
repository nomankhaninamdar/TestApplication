package com.noman.oop.pollymorphism.methodoverloading;

public class MethodOverloadingDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingDemo3 demo = new MethodOverloadingDemo3();
		
		/*
		 *  In below example null can be passed to any of the overloaded methods 
		 *  since all 3 methods can take null value as argument
		 *  hence compiler can not decide which method to call
		 *  hence we get compiler error here
		 * 
`		 */
		
		//demo.m1(null);
		
		demo.m1("noman"); // argument string is passed. String overloaded method is called here
		
		demo.m1(new StringBuffer("noman")); // argument stringBuffer is passed. stringBuffer overloaded method is called here
		
		demo.m1(121); //Integer argument is passed here
	}

	public void m1(String str)
	{
		System.out.println("Sting arg method...");
	}
	
	public void m1(StringBuffer sb)
	{
		System.out.println("Stringbuffer arg method...");
	}
	
	public void m1(Integer i)
	{
		System.out.println("Integer arg method...");
	}
}
