package com.noman.designpatterns.abstractfactory;

public class AutoFactory extends AbstractVehicleFactory {

	@Override
	public Vehicle getVehicle() {
		// TODO Auto-generated method stub
		return new  Auto();
	}

}
