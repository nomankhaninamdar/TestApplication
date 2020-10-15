package com.noman.oop.pollymorphism.methodoverloading;

/**
 * @author Noman
 *
 * Automatic promotion in overloading
 * 
 * if compiler doesnt find any suitable overloaded method then it will automatically promote its type as follows
 * 
 * byte-->short -->int -->long -->float-->double
 * 
 *        char -->int   
 */

public class MethodOverloadingDemo2 {

	public static void main(String[] args) {

		MethodOverloadingDemo2 demo = new  MethodOverloadingDemo2();
		
		demo.m1(10);  //argument int
		
		demo.m1(10.5f); //argument float
		
		demo.m1('a'); // argument char is promoted to int as overloaded method with int type is present.
		
		demo.m1(10L);  //argument long is promoted to float as overloaded method with float type is present 
		
		/*
		 * In below call 10.5 is by defult double value. double value can not be auto promoted and there is no matching method
		 *  hence compiler gives error.
		 */
		
		
		//demo.m1(10.5); 
		
	}
	public void m1(int i)
	{
		System.out.println("int arg method with argument:"+i);
	}
	
	public void m1 (float i)
	{
		System.out.println("float arg method with argument"+i);
	}
	

}
