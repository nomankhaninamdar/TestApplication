package com.noman.designpatterns.factory;

public class VehicleFactory {
	static Vehicle vehicle =null;

	public static Vehicle getVehicle(String vehicleType)
	{
		if(vehicleType=="Car")
		{
			vehicle = new Car();
			return vehicle;
		}
		else if(vehicleType=="Bike")
		{
			vehicle = new Bike();
			return vehicle;
		}
		
		else if(vehicleType=="Auto")
		{
			vehicle = new Auto();
			return vehicle;
		}
		return vehicle;
	}
}
