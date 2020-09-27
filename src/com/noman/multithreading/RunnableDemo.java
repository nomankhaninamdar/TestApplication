package com.noman.multithreading;

public class RunnableDemo {

	
	public static void main(String [] args)
	{
		System.out.println("In " + Thread.currentThread().getName() + " Thread");
		
		MyRunnable r = new MyRunnable();
		
		Thread t = new Thread(r);
		
		t.setName("MyRunnable");
		
		t.start();
	}
  
}
