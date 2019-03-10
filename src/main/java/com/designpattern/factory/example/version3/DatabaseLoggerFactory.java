package com.designpattern.factory.example.version3;

// 數據庫日誌紀錄器工廠: 具體工廠
public class DatabaseLoggerFactory implements LoggerFactory {

	@Override
	public Logger createLogger() {
		// 使用默認的方式連接數據庫，代碼省略
		Logger logger = new DatabaseLogger(); // 創建數據庫日誌紀錄器對象
		// 初始化數據庫日誌紀錄器.....
		return logger;
	}

	@Override
	public Logger createLogger(String args) {
		// 使用參數args作為連接字符串來連接數據庫，代碼省略
		Logger logger = new DatabaseLogger(); // 創建數據庫日誌紀錄器對象
		return logger;
	}

	@Override
	public Logger createLogger(Object obj) {
		// 使用封裝在參數obj中的連接字符串來連接數據庫，代碼省略
		Logger logger = new DatabaseLogger(); // 創建數據庫日誌紀錄器對象
		return logger;
	}

}
