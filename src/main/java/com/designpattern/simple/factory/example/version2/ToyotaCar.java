package com.designpattern.simple.factory.example.version2;

public class ToyotaCar extends Car{

	public ToyotaCar() {
		System.out.println("======= 安裝Toyota引擎 =======");
	}
	
	@Override
	public void run() {
		System.out.println("Toyota跑起來!!!!!");
	}

}
