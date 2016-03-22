package Sample;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XLM_reader_DOM {

	public static void main(String[] args) {
		//TODO Auto-generated method stub C:\Users\praveenkumar.jaya\workspace\TestNG\XML_input.xml
		try{
		//File samplexml = new File("C:/Users/praveenkumar.jaya/workspace/TestNG/XML_input.xml");
		File samplexml = new File("XML_input.xml");
		DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbfactory.newDocumentBuilder();
		Document doc =dBuilder.parse(samplexml);
		
		doc.getDocumentElement().normalize();
		System.out.println("Root Element " +doc.getDocumentElement().getNodeName());
		
		NodeList nList = doc.getElementsByTagName("staff");

		
		for(int i = 0; i < nList.getLength(); i++)
			{
				Node nNode = nList.item(i);
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
				System.out.println("\nNode type is!!!!!! :" + nNode.getNodeType());
				System.out.println(nNode.getChildNodes().getLength());
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					System.out.println("inside if loop");
					
					Element eElement = (Element) nNode;
					
					System.out.println("Staff id : " + eElement.getAttribute("id"));
					System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
					System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(1).getTextContent());
					System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
					System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
					System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());

				}
				else
				{
					System.out.println("NOt a element node");
				}	
			}
		}
		catch(Exception e)
		{
			
		}
		

	}

}
