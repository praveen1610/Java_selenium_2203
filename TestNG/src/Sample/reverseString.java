package Sample;

import java.util.Scanner;

public class reverseString {
	public static void main(String args[]){
		Scanner inputstring = new Scanner(System.in);
		String originalString = inputstring.nextLine();
		int length = originalString.length();
		for(int i = length-1; i>=0; i--){
			//System.out.print(originalString.charAt(2));
			System.out.print(originalString.charAt(i));
			
		}
		//System.out.print(originalString.charAt(2));
	}

}
