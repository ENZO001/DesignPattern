package com.designpattern.abstractfactory.example;

// Summer組合框類: 具體產品
public class SummerComboBox implements ComboBox {

	@Override
	public void display() {
		System.out.println("顯示藍色邊框組合框");
	}

}
