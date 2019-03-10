package com.designpattern.openclose.better;

public class Main {

	public static void main(String[] args) {
		ChartDisplay chartDisplay = new ChartDisplay();
		chartDisplay.setChart(new PieChart());
		chartDisplay.display();
	}
	
}
