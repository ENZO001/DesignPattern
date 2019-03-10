package com.designpattern.factory.example.version3;

// 文件日誌紀錄器工廠: 具體工廠
public class FileLoggerFactory implements LoggerFactory {

	@Override
	public Logger createLogger() {
		// 使用默認的方式創建文件，代碼省略
		Logger logger = new FileLogger(); // 創建文件日誌紀錄器對象
		return logger;
	}

	@Override
	public Logger createLogger(String args) {
		// 使用參數args字符串來創建文件，代碼省略
		Logger logger = new FileLogger(); // 創建文件日誌紀錄器對象
		return logger;
	}

	@Override
	public Logger createLogger(Object obj) {
		// 使用封裝在參數obj中的字符串來創建文件，代碼省略
		Logger logger = new FileLogger(); // 創建文件日誌紀錄器對象
		return logger;
	}

}
