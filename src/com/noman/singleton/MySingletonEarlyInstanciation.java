package com.noman.singleton;

public class MySingletonEarlyInstanciation {

	private static MySingletonEarlyInstanciation singletonObj = new MySingletonEarlyInstanciation();
	
	private MySingletonEarlyInstanciation()
	{
		
	}
	
	public  static MySingletonEarlyInstanciation getSingletonObj()
	{
		return singletonObj;
	}
}
