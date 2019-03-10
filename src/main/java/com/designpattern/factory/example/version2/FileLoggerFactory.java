package com.designpattern.factory.example.version2;

// 文件日誌紀錄器工廠: 具體工廠
public class FileLoggerFactory implements LoggerFactory {

	@Override
	public Logger createLogger() {
		Logger logger = new FileLogger(); // 創建文件日誌紀錄器對象
		// 創建文件，代碼省略
		return logger;
	}

}
