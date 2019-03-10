package com.designpattern.abstractfactory.example;

// Spring組合框類: 具體產品
public class SpringComboBox implements ComboBox {

	@Override
	public void display() {
		System.out.println("顯示綠色邊框組合框");
	}

}
