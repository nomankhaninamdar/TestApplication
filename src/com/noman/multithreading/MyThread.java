package com.noman.multithreading;

public class MyThread extends Thread {

	public void run()
	{
		System.out.println("In " +Thread.currentThread().getName()+" Thread");
		
		
		
		for(int i=0;i<10;i++)
		{
			System.out.println("MyThread thread");
		}
	}
	
}
