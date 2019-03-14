package com.designpattern.singleton;

public class LazyLoadBalancer {

	private volatile static LazyLoadBalancer instance = null;

	private LazyLoadBalancer() {

	}

	public static LazyLoadBalancer getInstance() {
		if (instance == null) {
			synchronized (LazyLoadBalancer.class) {
				if (instance == null) {
					instance = new LazyLoadBalancer();
				}
			}
		}
		return instance;
	}

}
