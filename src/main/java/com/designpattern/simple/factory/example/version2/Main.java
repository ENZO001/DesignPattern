package com.designpattern.simple.factory.example.version2;

public class Main {

	public static void main(String[] args) {
		Car car;
		String carBrand = XMLUtil.getCarBrand(); // 讀取配置文件中的參數
		car = CarFactory.getCar(carBrand); // 創建車子對象
		car.mountingTire();
		car.run();
	}

}
