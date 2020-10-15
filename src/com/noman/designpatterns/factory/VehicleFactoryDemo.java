package com.noman.designpatterns.factory;

public class VehicleFactoryDemo {
	
	public static void main(String args[]) {
		
		Vehicle car = VehicleFactory.getVehicle("Car");
		
		Vehicle bike= VehicleFactory.getVehicle("Bike");
		
		Vehicle auto= VehicleFactory.getVehicle("Auto");
		
		
		System.out.println("No. of wheels in a Car:"+ car.getWheels());
		
		System.out.println("No. of wheels in a Bike:"+ bike.getWheels());
		
		System.out.println("No. of wheels in a Auto:"+ auto.getWheels());

	}

}
