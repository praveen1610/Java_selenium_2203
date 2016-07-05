package Core_Java_samples;

import java.util.Scanner;

public class binToDec {
	static int sum = 0;
	  public static void main(String a[]){
	        int number; 
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter a positive integer");
	        
	        if(in.hasNextInt()){
	        	number = in.nextInt();
	        if (number < 0) {
	            System.out.println("Error: Not a positive integer");
	        } else { 

	            System.out.print("Convert to binary is:");
	            printBinaryform(number);
	        }
	        System.out.print(sum);
	    }
	        else {
	        	System.out.println("Error: Enter Only interger");
	        }
	  }
	  	
	    
	  	private static void printBinaryform(int number) {
	        int remainder;

	        if (number <= 0) {
	            System.out.print(number);
	            return;   // KICK OUT OF THE RECURSION
	        }

	        remainder = number %2; 
	        //System.out.print(remainder);
	        sum = sum *10 + remainder;
	        printBinaryform(number / 2);
	        
	    }
	  	
}


