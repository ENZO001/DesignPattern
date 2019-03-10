package com.designpattern.factory.example.version4;

// 日誌紀錄器工廠接口: 抽象工廠
public abstract class LoggerFactory {

	public void writeLog() {
		Logger logger = this.createLogger();
		logger.writeLog();
	}

	public abstract Logger createLogger();

}
