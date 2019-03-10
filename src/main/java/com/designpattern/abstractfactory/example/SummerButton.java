package com.designpattern.abstractfactory.example;

// Summer按鈕類: 具體產品
public class SummerButton implements Button{

	@Override
	public void display() {
		System.out.println("顯示淺藍色按鈕");
	}

}
