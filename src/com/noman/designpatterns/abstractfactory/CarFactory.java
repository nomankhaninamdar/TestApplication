package com.noman.designpatterns.abstractfactory;

public class CarFactory extends AbstractVehicleFactory{

	@Override
	public Vehicle getVehicle() {
		// TODO Auto-generated method stub
		return new Car();
	}

}
