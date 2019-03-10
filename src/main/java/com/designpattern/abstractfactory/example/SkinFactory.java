package com.designpattern.abstractfactory.example;

// 介面皮膚工廠接口: 抽象工廠
public interface SkinFactory {

	public Button createButton();

	public TextField createTextField();

	public ComboBox createComboBox();
}
