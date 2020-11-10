package com.noman.java8.optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Optional<Integer> value1 = Optional.ofNullable(10);
		
		Optional<Integer> value2 = Optional.empty();
		
		Integer sum=sum(value1,value2);
		
		System.out.println(sum);
	}

	private static Integer sum(Optional<Integer> value1, Optional<Integer> value2) {
		// TODO Auto-generated method stub
		if(value1.isPresent() & value2.isPresent())
		{
			return value1.get()+ value2.get();
		}
		else
		{
			
			
			return value1.orElse(10)+ value2.orElse(20);
					
		}
	}

}
