package com.noman.multithreading.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub

		ExecutorService service = Executors.newFixedThreadPool(10);
		
		Future future=service.submit(new MyCallableTask());
		
		String futureString=(String) future.get();
		
		System.out.println(futureString);
	}

}
