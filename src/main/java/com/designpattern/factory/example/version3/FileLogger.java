package com.designpattern.factory.example.version3;

// 文件日誌紀錄器: 具體產品
public class FileLogger implements Logger {

	@Override
	public void writeLog() {
		System.out.println("Write file log.");
	}

}
