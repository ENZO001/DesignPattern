package com.designpattern.factory.example.version3;

// 日誌紀錄器工廠接口: 抽象工廠
public interface LoggerFactory {

	public Logger createLogger();

	public Logger createLogger(String args);

	public Logger createLogger(Object obj);

}
