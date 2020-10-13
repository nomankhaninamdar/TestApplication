package com.noman.designpatterns.abstractfactory;

public class VehicleFactory {
	
	public static Vehicle getVehicle(AbstractVehicleFactory factory)
	{
		return factory.getVehicle();
		
	}

}
