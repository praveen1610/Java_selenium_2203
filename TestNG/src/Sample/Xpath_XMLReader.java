package Sample;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;


public class Xpath_XMLReader {
	public static void main(String[] args) {
	      try {
	         File inputFile = new File("employee.xml");
	         DocumentBuilderFactory dbFactory	= 	DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder;
	         dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();

	         XPath xPath =  XPathFactory.newInstance().newXPath();
	         String expression = "/class/student[@rollno='593']";	  
	         NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
             Node nNode = nodeList.item(0);
             Element eElement = (Element) nNode;
	         System.out.println("Last Name : " + eElement.getElementsByTagName("marks").item(0).getTextContent());
	        
	      }
	      
	      catch (ParserConfigurationException e) {
	          e.printStackTrace();
	       } catch (SAXException e) {
	          e.printStackTrace();
	       } catch (IOException e) {
	          e.printStackTrace();
	       } catch (XPathExpressionException e) {
	          e.printStackTrace();
	       }
	    }
	 }