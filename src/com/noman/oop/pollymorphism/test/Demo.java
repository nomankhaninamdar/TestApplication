package com.noman.oop.pollymorphism.test;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p= new Child ();
		
		System.out.println(p.myMethod());
		
		p.parentMethod(); // only methods present in Parent class can be called using parent ref here
		
		Child c =new Child();
		
		//both child and parent class methods can be called using child ref here
		
		c.childMethod(); //child method present in child class called
		
		c.parentMethod(); // parent method present in parent class called
		
		System.out.println(c.myMethod());
		
	}

}
