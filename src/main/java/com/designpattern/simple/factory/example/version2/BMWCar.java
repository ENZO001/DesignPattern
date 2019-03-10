package com.designpattern.simple.factory.example.version2;

public class BMWCar extends Car {

	public BMWCar() {
		System.out.println("======= 安裝BMW引擎 =======");
	}

	@Override
	public void run() {
		System.out.println("BMW跑起來!!!!!");
	}

}
