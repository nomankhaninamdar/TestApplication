package com.noman.java8.functionalinterfaces;

public class DobleColonOperatorDemo {

	
	public static void  m1()
	{
		System.out.println("my method");
	}
	
	public static void main(String [] args)
	{
		//MyFunctionalInterface my = ()  -> System.out.println("my method");
		
		//my.demo();
		
		MyFunctionalInterface my= DobleColonOperatorDemo :: m1;
		
		my.demo();
		
		
	}
}
