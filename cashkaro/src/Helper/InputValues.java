package Helper;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class InputValues {
	 
	Properties prop = new Properties();

	public InputValues(){
		
		   try{
		    	
		    	InputStream inputfilelocation = getClass().getClassLoader().getResourceAsStream("Datastorage.properties");
				//InputStream inputfilelocation = null;
				//inputfilelocation = new FileInputStream("C://Users//praveenkumar.jaya//workspace//cashkaro//src//Helper//Datastorage.properties");
				prop.load(inputfilelocation);
				
			  }
			catch (IOException e)
				{
					e.printStackTrace();	
				}
	}
	
	public String InputValueof(String ElementName){
		 
				
				ElementName = prop.getProperty(ElementName);
			    return ElementName;
		}
}
