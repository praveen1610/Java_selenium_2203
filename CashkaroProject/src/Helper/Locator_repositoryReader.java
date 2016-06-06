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


public class Locator_repositoryReader {
	
	XPath xpathtest;
	Document Doc;
//	public static void main(String[] args){
//		Locator_repositoryReader test = new Locator_repositoryReader("XML_input.xml");
//		String test1 = test.getlocation("SubmitButton");
//		System.out.println(test1);
//		
//	}
	public Locator_repositoryReader (String LocationFileName){
		try{
			
			//File inputfile = new File("c:/Users/praveenkumar.jaya/workspace/CashkaroProject/LocatorRepository/"+LocationFileName);
			File inputfile = new File("./LocatorRepository/"+LocationFileName);
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
			nodeList = (NodeList) xpathtest.compile("/Locator").evaluate(Doc, XPathConstants.NODESET);
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
