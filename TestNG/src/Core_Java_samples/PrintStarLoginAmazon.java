package Core_Java_samples;

import java.util.Scanner;

import org.junit.internal.matchers.StacktracePrintingMatcher;

//write a program which should accept and integer and print a below 
//1 *		2 *			3*
// 		  	  ***		 ***
//		      *			 *****
//		  		     	 ***
//		  			     *

public class PrintStarLoginAmazon {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int maxN = input.nextInt();
		int maxStars = ((maxN * 2) -1);
		int noOfLines = maxStars;
		int starCount = 1;
		boolean printReverse = false;
		for(int i = 1; i<=noOfLines; i++)
		{
			int currentStarCount = (starCount * 2 ) -1;
			if(!printReverse && currentStarCount >= maxStars){
				printReverse = true;
			}
			
			if(printReverse){
				starCount = starCount - 1;
			} else {
				starCount +=1;
			}
			
			PrintStars(currentStarCount);
		}
	}
	
	private static void PrintStars(int noOfStars){
		for(int j = 0; j<noOfStars; j++){
			System.out.print("*");
		}
			System.out.print("\n");
	}
}


