package com.designpattern.singleton;

public class EagerLoadBalancer {

	private static final EagerLoadBalancer instance = new EagerLoadBalancer();

	private EagerLoadBalancer() {

	}

	public static EagerLoadBalancer getInstance() {
		return instance;
	}

}
