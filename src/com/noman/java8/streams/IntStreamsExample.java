package com.noman.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class IntStreamsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]= {22,11,33,0,1,5,13,3,0};
		
		IntStream.of(array).distinct().sorted().limit(3).forEach(System.out::println);;
		
		int max = IntStream.of(array).max().getAsInt();
		
		System.out.println(max);
		
		IntStream.of(10,2,3,1,9,7,66,44,11).sorted().limit(3).forEach(System.out::println);
		
		
		
		
		
		
	}

}
