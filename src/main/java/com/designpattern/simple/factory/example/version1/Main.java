package com.designpattern.simple.factory.example.version1;

public class Main {

	public static void main(String[] args) {
		Car car;
		car = CarFactory.getCar("Toyota");
		car.mountingTire();
		car.run();
		
		car = CarFactory.getCar("BMW");
		car.mountingTire();
		car.run();
	}
	
}
