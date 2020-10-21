package com.noman.designpatterns.builder;

public class CarBuilder {
	
private String engine;
	
	private String typeOfGears;
	
	private String make;
	
	private float average;
	
	private int noOfAirbags;
	
	private int noOfSeats;
	
	private boolean isLuxary;

	public CarBuilder setEngine(String engine) {
		this.engine = engine;
		return this;
	}

	public CarBuilder setTypeOfGears(String typeOfGears) {
		this.typeOfGears = typeOfGears;
		return this;
	}

	public CarBuilder setMake(String make) {
		this.make = make;
		return this;
	}

	public CarBuilder setAverage(float average) {
		this.average = average;
		return this;
	}

	public CarBuilder setNoOfAirbags(int noOfAirbags) {
		this.noOfAirbags = noOfAirbags;
		return this;
	}

	public CarBuilder setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
		return this;
	}

	public CarBuilder setLuxary(boolean isLuxary) {
		this.isLuxary = isLuxary;
		return this;
	}
	
	public Car build()
	{
		return new Car(engine, typeOfGears, make, average, noOfAirbags, noOfSeats, isLuxary);
	}


}
