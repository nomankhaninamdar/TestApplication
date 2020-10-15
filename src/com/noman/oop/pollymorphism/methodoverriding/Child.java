package com.noman.oop.pollymorphism.methodoverriding;

public class Child extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In Child class main method...");
	}

	/*
	 * In Child class m1() method doesn't throw any exception
	 * Parent class m1() method throws Exception
	 */
	
	public void m1()  
	{
		System.out.println("In Child class m1() ");

	}
	
	/*
	 * In Child class m2() method throws NullPointerException
	 * Parent class m2() method doesn't throw any exception
	 */
	
	
	public void m2() throws NullPointerException
	{
		System.out.println("Parent class m2() throws NullPointerException");
	}
	
	/*
	 * In Child class m3() method throws NullPointerException
	 * Parent class m3() method throws Exception which is parent class of NullPointerException
	 */
	
	public void m3() throws NullPointerException
	{
		System.out.println("Parent class m3() throws NullPointerException");
	}
	
	
	/*
	 * In Child class m4() method throws Exception
	 * Parent class m4() method throws NullPointerException which is child class of NullPointerException
	 * hence we get compile time error
	 */
	
	/*
	public void m4() throws Exception
	{
		System.out.println("Parent class m4() throws Exception");
	}
	*/
	
	
	public String m5()
	{
		return "test";
	}
	
	public String m6()
	{
		return "test";
	}
}
