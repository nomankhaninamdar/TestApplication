package com.noman.designpatterns.abstractfactory;

public class BikeFactory  extends AbstractVehicleFactory{

	@Override
	public Vehicle getVehicle() {
		// TODO Auto-generated method stub
		return new Bike();
	}
	

}
