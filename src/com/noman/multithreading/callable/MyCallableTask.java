package com.noman.multithreading.callable;

import java.util.concurrent.Callable;

public class MyCallableTask implements Callable<String> {
	
	public String call()
	{
		return "test";
	}

}
