package com.designpattern.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoadBalancer {

	private static LoadBalancer loadBalancer = null;

	private List<String> serverList = null;

	private LoadBalancer() {
		serverList = new ArrayList<>();
	}
	
	public static LoadBalancer getLoadBalancer() {
		if (loadBalancer == null) {
			loadBalancer = new LoadBalancer();
		}
		return loadBalancer;
	}

	public void addServer(String server) {
		serverList.add(server);
	}

	public void removeServer(String server) {
		serverList.remove(server);
	}
	
	public String getServer() {
		Random random = new Random();
		int i = random.nextInt(serverList.size());
		return serverList.get(i);
	}
}
