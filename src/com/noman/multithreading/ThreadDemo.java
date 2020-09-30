package com.noman.multithreading;

public class ThreadDemo {

	public static void main(String [] args) throws InterruptedException
	{
		System.out.println(Thread.currentThread().getName()+" started..");
		
		MyThread t =new  MyThread();
		t.setName("MyThread");
		t.start();
		
		System.out.println("In "+Thread.currentThread().getName()+" Thread");
		
		//Thread.yield();
		t.join();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}
				
				
	}
}
