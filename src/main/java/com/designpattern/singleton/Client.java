package com.designpattern.singleton;

public class Client {

	public static void main(String[] args) {
		LoadBalancer loadBalancer1, loadBalancer2, loadBalancer3, loadBalancer4;
		loadBalancer1 = LoadBalancer.getLoadBalancer();
		loadBalancer2 = LoadBalancer.getLoadBalancer();
		loadBalancer3 = LoadBalancer.getLoadBalancer();
		loadBalancer4 = LoadBalancer.getLoadBalancer();
		
		if (loadBalancer1 == loadBalancer2 && loadBalancer3 == loadBalancer4 && loadBalancer1 == loadBalancer4) {
			System.out.println("具有唯一性");
		}
		
		loadBalancer1.addServer("Server 1");
		loadBalancer1.addServer("Server 2");
		loadBalancer1.addServer("Server 3");
		loadBalancer1.addServer("Server 4");
		
		for (int i = 0; i < 10; i++) {
			String server = loadBalancer1.getServer();
			System.out.println("請求分發至服務器: " + server);
		}
	}
	
}
