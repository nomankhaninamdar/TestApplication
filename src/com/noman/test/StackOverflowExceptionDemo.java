package com.noman.test;

public class StackOverflowExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test();

	}
	
	public static int test()
	{
		return test();
	}

}
