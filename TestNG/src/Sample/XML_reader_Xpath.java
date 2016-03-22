package Sample;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class XML_reader_Xpath {
	public static void main (String[] arg){
		try{
			File inputfile = new File("XML_input.xml");
			
			DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dbuilder = dbfactory.newDocumentBuilder();
			Document Doc = dbuilder.parse(inputfile);
			Doc.getDocumentElement().normalize();
			
			XPath xpathtest = XPathFactory.newInstance().newXPath();
			
			
			NodeList nodeList = (NodeList) xpathtest.compile("/company/staff").evaluate(Doc, XPathConstants.NODESET);
			
			Node nNode = nodeList.item(0);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
			Element elementtest = (Element) nNode;
			String print = elementtest.getAttribute("id").toString();
			
			String attributetest = elementtest.getElementsByTagName("nickname").item(0).getTextContent();
			System.out.println(attributetest+ " "+print );
			}
			
			
			
		}
		catch (Exception e)
		{
			System.out.println("errorrrrrrrrrrrrrrr");
		}
	}

}
