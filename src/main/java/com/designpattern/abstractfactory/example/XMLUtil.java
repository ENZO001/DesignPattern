package com.designpattern.abstractfactory.example;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {

	public static Object getBean() {
		DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		try {
			builder = dFactory.newDocumentBuilder();
			Document document;
			document = builder.parse(new File(
					"F:\\Workspace\\JavaWorkspace2019\\03_2018_ProblemTestWorkspace\\DesignPattern\\src\\main\\resources\\config.xml"));

			NodeList nodeList = document.getElementsByTagName("abstractClassName");
			Node classNode = nodeList.item(0).getFirstChild();
			String className = classNode.getNodeValue();

			Class<?> clazz = Class.forName(className);
			Object obj = clazz.newInstance();

			return obj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
