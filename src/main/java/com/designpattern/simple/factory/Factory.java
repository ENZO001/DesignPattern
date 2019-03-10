package com.designpattern.simple.factory;

public class Factory {

	// 靜態工廠方法
	public static Product getProduct(String arg) {
		Product product = null;

		if ("A".equalsIgnoreCase(arg)) {
			product = new ConcreteProductA();
			// 初始化設置product

		} else if ("B".equalsIgnoreCase(arg)) {
			product = new ConcreteProductB();
			// 初始化設置product
		}

		return product;
	}

}
