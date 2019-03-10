package com.designpattern.factory.example.version1;

// 數據庫日誌紀錄器: 具體產品 
public class DatabaseLogger implements Logger {

	@Override
	public void writeLog() {
		System.out.println("Write database log.");
	}

}
