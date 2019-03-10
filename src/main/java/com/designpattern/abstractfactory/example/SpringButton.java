package com.designpattern.abstractfactory.example;

// Spring按鈕類: 具體產品
public class SpringButton implements Button {

	@Override
	public void display() {
		System.out.println("顯示淺綠色按鈕");
	}

}
