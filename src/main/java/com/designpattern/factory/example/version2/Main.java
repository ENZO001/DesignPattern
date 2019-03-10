package com.designpattern.factory.example.version2;

public class Main {

	public static void main(String[] args) {
		LoggerFactory factory;
		Logger logger;
		factory = (LoggerFactory) XMLUtil.getBean();
		logger = factory.createLogger();
		logger.writeLog();
	}
	
}
