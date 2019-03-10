package com.designpattern.factory.example.version4;

// 文件日誌紀錄器工廠: 具體工廠
public class FileLoggerFactory extends LoggerFactory {

	@Override
	public Logger createLogger() {
		// 使用默認的方式創建文件，代碼省略
		Logger logger = new FileLogger(); // 創建文件日誌紀錄器對象
		return logger;
	}

}
