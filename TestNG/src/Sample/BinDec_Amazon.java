package Sample;

import java.util.Scanner;

public class BinDec_Amazon {
	static int output = 0;
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int inputdec = input.nextInt();
		
		findtheBin(inputdec);
		System.out.println("\n" +output);
		
	}
	
	static void findtheBin(int inputvalue){
		
		
		
		if(inputvalue != 1){
			findtheBin(inputvalue/2);
		}
		int reminder = inputvalue % 2;
		System.out.print(reminder);
		 output = (output * 10) + reminder;
		
	
	}
}
