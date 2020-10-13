package com.noman.designpatterns.abstractfactory;

public class VehicleFactoryDemo {
	
	public static void main(String args[]) {
		
		Vehicle car = VehicleFactory.getVehicle(new CarFactory());
		
		Vehicle bike= VehicleFactory.getVehicle(new BikeFactory());
		
		Vehicle auto= VehicleFactory.getVehicle(new AutoFactory());
		
		
		System.out.println("No. of wheels in a Car:"+ car.getwheels());
		
		System.out.println("No. of wheels in a Bike:"+ bike.getwheels());
		
		System.out.println("No. of wheels in a Auto:"+ auto.getwheels());

	}

}
