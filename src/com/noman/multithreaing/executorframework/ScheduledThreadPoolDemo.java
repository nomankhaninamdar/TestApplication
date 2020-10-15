package com.noman.multithreaing.executorframework;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
		
		service.schedule(new RunnableTask(), 1000, TimeUnit.MILLISECONDS);
		
		service.scheduleAtFixedRate(new RunnableTask(), 5, 2, TimeUnit.SECONDS);
		
		//service.shutdown();
	}

}
