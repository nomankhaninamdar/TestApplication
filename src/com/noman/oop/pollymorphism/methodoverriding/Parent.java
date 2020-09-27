package com.noman.oop.pollymorphism.methodoverriding;

public class Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In parent class main method...");
	}
	
	public void m1() throws Exception
	{
		System.out.println("Parent class m1() throws Exception");
	}
	
	public void m2() 
	{
		System.out.println("Parent class m2()");
	}
	

	public void m3() throws Exception
	{
		System.out.println("Parent class m3() throws Exception");
	}

	public void m4() throws NullPointerException
	{
		System.out.println("Parent class m4() throws NullPointerException");
	}
	
	public Object m5()
	{
		return new Object();
	}
	
	
	public String m6()
	{
		return "test";
	}
}
