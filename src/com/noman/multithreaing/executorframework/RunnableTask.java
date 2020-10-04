package com.noman.multithreaing.executorframework;

public class RunnableTask implements Runnable{

	public void run()
	{
		System.out.println("Current Executing Thread:"+ Thread.currentThread().getName());
	}
}
