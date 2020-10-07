package com.noman.designpatterns.builder;

public class BuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone phone= new PhoneBuilder().setOs("Snapdragon").setRam(8).setScreenSize(5.5).build();
		System.out.println(phone);
	}

}
