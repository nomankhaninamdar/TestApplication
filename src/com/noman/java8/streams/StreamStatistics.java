package com.noman.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamStatistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List  <Integer> integers = Arrays.asList(12,13,14,56,67);
		
		integers.stream().filter(i->i%2==1).collect(Collectors.toList()).forEach(System.out::println);
		
		List  <Integer> Filteredintegers =integers.stream().filter(i->i%2==1).collect(Collectors.toList());
		
		System.out.println(Filteredintegers);
		
		
		
	}
	

}
