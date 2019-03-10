package com.designpattern.factory.example.version1;

// 數據庫日誌紀錄器工廠: 具體工廠
public class DatabaseLoggerFactory implements LoggerFactory {

	@Override
	public Logger createLogger() {
		// 連接數據庫，代碼省略
		Logger logger = new DatabaseLogger(); // 創建數據庫日誌紀錄器對象
		// 初始化數據庫日誌紀錄器，代碼省略
		return logger;
	}

}
