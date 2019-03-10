package com.designpattern.abstractfactory.example;

// Spring文本框類: 具體產品
public class SpringTextField implements TextField{

	@Override
	public void display() {
		System.out.println("顯示綠色邊框文本框");
	}

}
