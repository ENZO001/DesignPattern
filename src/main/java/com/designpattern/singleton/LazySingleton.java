package com.designpattern.singleton;

public class LazySingleton {

	private volatile static LazySingleton instance = null;

	private LazySingleton() {

	}

	public static LazySingleton getInstance() {
		// 第一重判斷
		if (instance == null) {
			// 鎖定代碼塊
			synchronized (LazySingleton.class) {
				// 第二重判斷
				if (instance == null) {
					instance = new LazySingleton(); // 創建單例實例
				}
			}
		}
		return instance;
	}

}
