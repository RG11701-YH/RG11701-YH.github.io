package BridgeDemo;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtilPen {
	public static Object getBean(String kind) {
		if(kind =="pen") {
			try {
				//����DOM�ĵ�����
				DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder builder = dFactory.newDocumentBuilder();
				Document doc;
				doc = builder.parse(new File("config.xml"));
				
				//��ȡ�����������ı��ڵ�
				NodeList nl = doc.getElementsByTagName("className1");
				Node classNode = nl.item(0).getFirstChild();
				String cName = classNode.getNodeValue();
				
				//ͨ����������ʵ�����󲢽��䷵��
				Class c=Class.forName(cName);
				Object obj = c.newInstance();
				return obj;
			}catch(Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		if(kind == "color") {
			try {
				//����DOM�ĵ�����
				DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder builder = dFactory.newDocumentBuilder();
				Document doc;
				doc = builder.parse(new File("config.xml"));
				
				//��ȡ�����������ı��ڵ�
				NodeList nl = doc.getElementsByTagName("className2");
				Node classNode = nl.item(0).getFirstChild();
				String cName = classNode.getNodeValue();
				
				//ͨ����������ʵ�����󲢽��䷵��
				Class c=Class.forName(cName);
				Object obj = c.newInstance();
				return obj;
			}catch(Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		return kind;	
	}

}
