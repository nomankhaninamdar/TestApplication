package com.noman.multithreaing.executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class SingleThreadExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService service =Executors.newSingleThreadExecutor();
		
		for(int i=0;i<10;i++)
		{
			service.execute(new RunnableTask());
		}
		
		service.shutdown();
	}
	


}
