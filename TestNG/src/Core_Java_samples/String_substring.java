package Core_Java_samples;

public class String_substring {
	public static void main(String args[]){
	      String Str = new String("Welcome to Tutorialspoint.com");

	      String[] splitfunc = Str.split("t");
	      System.out.println(splitfunc[0].toString());
	      
	      
	      System.out.print("Return Value :" );
	       System.out.println(Str.substring(29) ); //Memory leak will happen since end is not given, will take same space of string

	      System.out.print("Return Value :" );
	      System.out.println(Str.substring(10, 15) );  //Will avoid memory leak
	   }

}
