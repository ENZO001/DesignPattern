package com.designpattern.factory.example.version1;

public class Main {

	public static void main(String[] args) {
		LoggerFactory factory;
		Logger logger;
		factory = new FileLoggerFactory();
		logger = factory.createLogger();
		logger.writeLog();
	}
	
}
