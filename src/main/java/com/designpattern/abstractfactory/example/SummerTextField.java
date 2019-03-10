package com.designpattern.abstractfactory.example;

// Summer文本框類: 具體產品
public class SummerTextField implements TextField {

	@Override
	public void display() {
		System.out.println("顯示藍色邊框文本框");
	}

}
