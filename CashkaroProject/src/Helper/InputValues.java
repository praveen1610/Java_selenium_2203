package Helper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class InputValues {
	 
	Properties prop = new Properties();

	public InputValues(String PropertyFile){
		
		   try{
		       InputStream inputfilelocation = getClass().getClassLoader().getResourceAsStream(PropertyFile);
				prop.load(inputfilelocation);
				
			  }
			catch (IOException e)
				{
					e.printStackTrace();	
				}
	}
	
	public String inputValueof(String ElementName){
		 
				
				ElementName = prop.getProperty(ElementName);
			    return ElementName;
		}
}
