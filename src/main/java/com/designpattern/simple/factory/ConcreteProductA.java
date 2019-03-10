package com.designpattern.simple.factory;

public class ConcreteProductA extends Product {

	// 實現業務方法
	@Override
	public void methodDiff() {
		System.out.println("This is the different method of product A");
	}

}
