package com.noman.singleton;

public class MySingletonLazyInstanciation {

	private static MySingletonLazyInstanciation singletonObj = null;
	
	private MySingletonLazyInstanciation()
	{
		
	}
	
	public  static MySingletonLazyInstanciation getSingletonObj()
	{
		if(singletonObj==null)
			singletonObj = new MySingletonLazyInstanciation();
		
		return singletonObj;
	}
}
