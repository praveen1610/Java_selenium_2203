package Sample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovidersample {
	
	 @DataProvider(name = "test1")
	  public Object[][] createData1() {
	   return new Object[][] {
	     { "Cedric", new Integer(36) },
	     { "Anne", new Integer(37)},
	   };
	  }
	   
	 
	  //This test method declares that its data should be supplied by the Data Provider
	  //named "test1"
	  @Test(dataProvider = "test1", groups = "sanity")
	  public void verifyData1(String n1, Integer n2) {
	   System.out.println(n1 + " " + n2);
	  }
	  
	  
	  @DataProvider(name="test2")
	  public Object[][] creatingData2(){
		  return new Object[][]{
			  { new Integer(36), new Integer(36)},
			     {new Integer(37), new Integer(36)},
	  };
	  }
}
