package com.noman.multithreading;

public class MyRunnable implements Runnable {

	public void run() {
		
		System.out.println("In " + Thread.currentThread().getName() + " Thread");
	}
	
}
