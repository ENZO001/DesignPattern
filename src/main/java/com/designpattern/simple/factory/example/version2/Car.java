package com.designpattern.simple.factory.example.version2;

public abstract class Car {

	public void mountingTire() {
		System.out.println("======= 車子安裝輪胎 =======");
	}
	
	public abstract void run();
	
}
