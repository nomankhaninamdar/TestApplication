package com.noman.designpatterns.singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Early Instanciation...");
		MySingletonEarlyInstanciation obj1 =MySingletonEarlyInstanciation.getSingletonObj();
		
		MySingletonEarlyInstanciation obj2 = MySingletonEarlyInstanciation.getSingletonObj();
		
		System.out.println(obj1.hashCode());
		
		System.out.println(obj2.hashCode());
		
		
		System.out.println("Lazy Instanciation...");
		
		MySingletonLazyInstanciation obj3 =MySingletonLazyInstanciation.getSingletonObj();
		
		MySingletonLazyInstanciation obj4 = MySingletonLazyInstanciation.getSingletonObj();
		
		System.out.println(obj3.hashCode());
		
		System.out.println(obj4.hashCode());

	}

}
