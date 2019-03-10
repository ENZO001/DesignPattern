package com.designpattern.simple.factory;

public abstract class Product {

	// 所有產品類的公共業務方法
	public void methodSame() {
		System.out.println("This is the same method of product.");
	}

	// 聲明抽象業務方法
	public abstract void methodDiff();
}
