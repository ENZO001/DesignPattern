package com.designpattern.simple.factory.example.version3;

public abstract class Car {

	// "抽象車類" & "車工廠類"合併
	public static Car getCar(String brand) {
		Car car = null;

		if ("BMW".equalsIgnoreCase(brand)) {
			car = new BMWCar();
			
		} else if ("Toyota".equalsIgnoreCase(brand)) {
			car = new ToyotaCar();
		}

		return car;
	}

	public void mountingTire() {
		System.out.println("======= 車子安裝輪胎 =======");
	}

	public abstract void run();

}
