package com.designpattern.simple.factory.example.version2;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {

	// 此方法用於從XML配置文件中讀取車子品牌，並返回品牌名
	public static String getCarBrand() {
		try {
			// 創建文檔對象
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document document;
			document = builder.parse(new File("F:\\Workspace\\JavaWorkspace2019\\03_2018_ProblemTestWorkspace\\DesignPattern\\src\\main\\resources\\config.xml"));

			// 獲取包含車子品牌類型的文本節點
			NodeList nodeList = document.getElementsByTagName("carBrand");
			Node classNode = nodeList.item(0).getFirstChild();
			String carBrand = classNode.getNodeValue().trim();
			return carBrand;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
