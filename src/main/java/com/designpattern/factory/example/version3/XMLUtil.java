package com.designpattern.factory.example.version3;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {

	public static Object getBean() {
		try {
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document document;
			document = builder.parse(new File(
					"F:\\Workspace\\JavaWorkspace2019\\03_2018_ProblemTestWorkspace\\DesignPattern\\src\\main\\resources\\config.xml"));

			NodeList nodeList = document.getElementsByTagName("className3");
			Node classNode = nodeList.item(0).getFirstChild();
			String cName = classNode.getNodeValue();
			
			Class<?> clazz = Class.forName(cName);
			Object obj = clazz.newInstance();
			return obj;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
