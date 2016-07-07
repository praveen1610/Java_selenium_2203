package Sample;

import java.util.Scanner;

public class reverseNumber {
	public static void main(String args[]){
		Scanner inputint = new Scanner(System.in);
		int inputno = inputint.nextInt();
		int ouput = 0;
		int reverseno = 0;
		while(inputno > 0){
			 reverseno = inputno % 10;
			 ouput = (ouput * 10)+ reverseno;
			inputno = inputno / 10;
		}
		System.out.println(ouput);
		
	}

}
