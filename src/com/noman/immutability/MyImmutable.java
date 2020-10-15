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
	
	public MyImmutable modify(int id,String name)
	{
		if(this.id==id && this.name==name)
		{
			return this;
		}
		
		else
		{
			return new MyImmutable(id, name);
		}
	}
	
	public static void main (String [] args)
	{
		
		MyImmutable obj = new MyImmutable(1, "name");
		
		MyImmutable obj2=obj.modify(2, "inamdar");
		
		System.out.println(obj==obj2);
		
	}
	
}
