package com.noman.java8.functionalinterfaces;

import java.util.function.Function;
import java.util.function.Predicate;

public class LamdaFunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Function is a functional interface with single abstract method apply
		 * 
		 * */
		
		Function<Integer,Integer> f= n->n*n; // lambda expression to find square of a number 

		System.out.println("Square of 4:"+f.apply(4));
		
		
		Predicate <Integer> p = n->n%2==0;
		
		System.out.println(p.test(3));
		
		
		Function <String, Integer> f1= s -> s.length();
		
		System.out.println("Length of String:"+f1.apply("noman") );
	}

}
