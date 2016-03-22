package Sample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
 
	@Parameters ({"prametertesting"})
	  @Test 
	  public void lovaba(String prametertesting) {
		  
		  System.out.println("I love "+ prametertesting);
		  System.out.println("Test Case two with Thread Id:- "
					+ Thread.currentThread().getId());
		  
	  }
	
 

}
