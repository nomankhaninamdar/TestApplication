package com.noman.designpatterns.builder;

public class Phone {

	private String os;
	
	private int ram;
	
	private int battery;
	
	private double screenSize;
	
	private String processor;

	public Phone(String oS, int ram, int battery, double screenSize, String processor) {
		super();
		this.os = oS;
		this.ram = ram;
		this.battery = battery;
		this.screenSize = screenSize;
		this.processor = processor;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", battery=" + battery + ", screenSize=" + screenSize
				+ ", processor=" + processor + "]";
	}
	

	
}
