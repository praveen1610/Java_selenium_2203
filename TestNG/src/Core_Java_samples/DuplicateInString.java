package Core_Java_samples;

import java.util.ArrayList;


public class DuplicateInString {


     public static void main(String args[]) {
         removeDuplicateString("Iloveindia,indiaisbest");
     }

     public static void removeDuplicateString(String input) {
    	// String input = "Java2Novice";
    	 ArrayList<Character> used = new ArrayList<>();
    	 for(int i = 0 ; i < input.length(); i++)
    	 {
    	 if(!used.contains(input.charAt(i)))
    	 {
    	 int count = 0;
    	 for(int j = 0; j < input.length(); j++)
    	 {
    	 if(input.charAt(i) == input.charAt(j))
    	 {
    	 count++;
    	 }

    	 }
    	 if(count > 1)
    	 {
    	 System.out.println(input.charAt(i)+" "+ (count));
    	 }
    	 used.add(input.charAt(i));
    	 }
    	 }
    	 System.out.println(input);
    	 }
    	 
     }

