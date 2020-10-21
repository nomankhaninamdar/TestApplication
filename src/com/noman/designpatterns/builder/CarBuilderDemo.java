package com.noman.designpatterns.builder;

public class CarBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new CarBuilder().setAverage(20).build();
		System.out.println(car);

	}

}
