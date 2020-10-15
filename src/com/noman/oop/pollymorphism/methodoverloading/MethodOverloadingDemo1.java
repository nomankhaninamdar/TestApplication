package com.noman.oop.pollymorphism.methodoverloading;

import java.util.ArrayList;
import java.util.List;

public class MethodOverloadingDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingDemo1 demo = new MethodOverloadingDemo1();
		
		/* Since there are 2 overloaded methods with String and Object as argument resp. more specific 
		 * method will be called in this case overloaded method with String as argument will be called.
		 * 
		 */
		
		demo.testOverloadedMethods(null);
		
		/* Since 121 is an integer and there is no overloaded method that takes Integer as argument. hence method with Object 
		 * as argument will be called.
		 * 
		 */
		
		demo.testOverloadedMethods(121);
		
		List <String> l= new ArrayList<String>();	
		l.add("noman");
		
		demo.testOverloadedMethods(l);
	}

	public void testOverloadedMethods(Object obj)
	{
		System.out.println("In Object overloaded method");
	}
	
	public void testOverloadedMethods(String obj)
	{
		System.out.println("In String overloaded method");
	}
}
