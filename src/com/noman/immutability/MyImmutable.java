package com.noman.immutability;

/*
 * Steps 
 * 1. Create a final class so that it should not be extended
 * 2. Create variables final and private
 * 3. Dont create setter methods
 * 
 * */


public final class MyImmutable {

	private final int id;
	
	private final String name;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public MyImmutable(int id, String name)
	{
		this.id=id;
		
		this.name=name;
		
		
	}
	
	public static void main (String [] args)
	{
		
		MyImmutable obj = new MyImmutable(1, "name");
		
	//	obj.id=2;  // obj can not be updated since it is immutable
	}
	
}
