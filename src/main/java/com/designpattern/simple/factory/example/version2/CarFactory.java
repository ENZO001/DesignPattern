package com.designpattern.simple.factory.example.version2;

public class CarFactory {

	public static Car getCar(String brand) {
		Car car = null;
		
		if ("BMW".equalsIgnoreCase(brand)) {
			car = new BMWCar();
		} else if ("Toyota".equalsIgnoreCase(brand)) {
			car = new ToyotaCar();
		}
		
		return car;
	}
	
}
