package com.designpattern.simple.factory;

public class Main {

	public static void main(String[] args) {
		Product product;
		product = Factory.getProduct("A"); // 通過工廠類創建產品對象
		product.methodSame();
		product.methodDiff();;
	}
	
}
