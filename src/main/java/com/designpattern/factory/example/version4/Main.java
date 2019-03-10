package com.designpattern.factory.example.version4;

public class Main {

	public static void main(String[] args) {
		LoggerFactory factory;
		factory = (LoggerFactory) XMLUtil.getBean();
		factory.writeLog(); // 直接使用工廠對象來調用產品對象的業務方法
	}

}
