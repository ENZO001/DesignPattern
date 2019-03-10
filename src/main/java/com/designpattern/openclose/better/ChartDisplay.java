package com.designpattern.openclose.better;

public class ChartDisplay {

	private AbstractChart chart;

	public void setChart(AbstractChart chart) {
		this.chart = chart;
	}

	// 如果要新增一種圖，就只要新建一個class繼承抽象類別就好，舊的程式無須修改，符合開閉原則
	public void display() {
		chart.display();
	}

}
