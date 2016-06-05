package Helper;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class Object_repositoryReader {
	
	XPath xpathtest;
	Document Doc;
	public static void main(String[] args){
		Object_repositoryReader test = new Object_repositoryReader("XML_input.xml");
		String test1 = test.getlocation("SubmitButton");
		System.out.println(test1);
		
	}
	public Object_repositoryReader (String LocationFileName){
		try{
			
			File inputfile = new File("c:/Users/praveenkumar.jaya/workspace/CashkaroProject/XpathHelper/"+LocationFileName);
			DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dbuilder = dbfactory.newDocumentBuilder();
			Doc = dbuilder.parse(inputfile);
			Doc.getDocumentElement().normalize();
			xpathtest = XPathFactory.newInstance().newXPath();
			
			}
		catch (Exception e)
		{
			System.out.println("Error in getting Locators from Xml File" +e);
		}
		
	}

	
	public String getlocation(String TagName){
		NodeList nodeList;
		String attributetest = null;
		try {
			nodeList = (NodeList) xpathtest.compile("/Xpath").evaluate(Doc, XPathConstants.NODESET);
			Node nNode = nodeList.item(0);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element elementtest = (Element) nNode;
				attributetest = elementtest.getElementsByTagName(TagName).item(0).getTextContent();
			}
		} 
		catch (XPathExpressionException e) {
			e.printStackTrace();
		}
		
		return attributetest;
		}
	}
