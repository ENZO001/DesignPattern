package com.designpattern.singleton;

public class SingletonBalancer {

	private SingletonBalancer() {
		
	}
	
	private static class HolderClass {
		private static final SingletonBalancer instance = new SingletonBalancer();
	}
	
	public static SingletonBalancer getInstance() {
		return HolderClass.instance;
	}
}
