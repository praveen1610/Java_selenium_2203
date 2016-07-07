package Sample;

import java.util.Scanner;

public class reverseNo_Amazon {
	static int output = 0;
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int inputdec = input.nextInt();
		findtheBin(inputdec);
	}
	
	static void findtheBin(int num){
		if (num>0) {
			  findtheBin(num/2);
		        System.out.print(num%2);
		    }
	}
}

