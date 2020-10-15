package com.noman.test;

public class Test {

	public static void main(String[] args) {
		
		int returnedValue=0;
		
		Test t =new Test();
		
		returnedValue=t.myMethod();
		
		System.out.println("Returned value:"+returnedValue);

	}
	
	public int myMethod()
	{
		int i=0;
		
		try {
			i=100/0;
		}
		catch(Exception e)
		{
			i=200;
			return i;
		}
		finally 
		{
			i =300;
			return i;
		}
		
		
	}

}
