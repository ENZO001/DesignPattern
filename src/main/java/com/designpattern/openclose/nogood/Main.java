package com.designpattern.openclose.nogood;

public class Main {

	public static void main(String[] args) {
		ChartDisplay chartDisplay = new ChartDisplay();
		chartDisplay.display("pie");
		chartDisplay.display("bar");
	}

}
