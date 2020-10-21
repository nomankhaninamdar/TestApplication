package com.noman.designpatterns.builder;

public class Car {

	private String engine;
	
	private String typeOfGears;
	
	private String make;
	
	private float average;
	
	private int noOfAirbags;
	
	private int noOfSeats;
	
	private boolean isLuxary;

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getTypeOfGears() {
		return typeOfGears;
	}

	public void setTypeOfGears(String typeOfGears) {
		this.typeOfGears = typeOfGears;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public float getAverage() {
		return average;
	}

	public void setAverage(float average) {
		this.average = average;
	}

	public int getNoOfAirbags() {
		return noOfAirbags;
	}

	public void setNoOfAirbags(int noOfAirbags) {
		this.noOfAirbags = noOfAirbags;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public boolean isLuxary() {
		return isLuxary;
	}

	public void setLuxary(boolean isLuxary) {
		this.isLuxary = isLuxary;
	}

	public Car(String engine, String typeOfGears, String make, float average, int noOfAirbags, int noOfSeats,
			boolean isLuxary) {
		super();
		this.engine = engine;
		this.typeOfGears = typeOfGears;
		this.make = make;
		this.average = average;
		this.noOfAirbags = noOfAirbags;
		this.noOfSeats = noOfSeats;
		this.isLuxary = isLuxary;
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + ", typeOfGears=" + typeOfGears + ", make=" + make + ", average=" + average
				+ ", noOfAirbags=" + noOfAirbags + ", noOfSeats=" + noOfSeats + ", isLuxary=" + isLuxary + "]";
	}
	
	
	
}
