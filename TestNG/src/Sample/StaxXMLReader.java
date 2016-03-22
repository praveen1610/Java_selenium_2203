package Sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class StaxXMLReader {

   public static void main(String[] args) {
   boolean bFirestname= false, blastname = false, bnickname = false,bmarks = false;
   try{   
	   FileReader test = new FileReader("employee.xml");
	   XMLInputFactory factory = XMLInputFactory.newFactory();
	   XMLEventReader eventReader = factory.createXMLEventReader(test);
	  // System.out.println(eventReader.getElementText().toString());
	   //XMLEvent event = 
   }
catch(Exception e){
	System.out.println("Dedlock exception" +e);
	}
   }
  }