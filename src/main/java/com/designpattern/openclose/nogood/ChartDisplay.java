package com.designpattern.openclose.nogood;

public class ChartDisplay {

	public void display(String type) {
		// 如果以後要擴充，就會需要改ChartDisplay的display方法，判斷式就會越來越長
		// 違反開閉原則
		if ("pie".equals(type)) {
			PieChart pieChart = new PieChart();
			pieChart.display();

		} else if ("bar".equals(type)) {
			BarChart barChart = new BarChart();
			barChart.display();
		}
	}

}
