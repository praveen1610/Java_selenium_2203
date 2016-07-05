package Sample;

import java.util.Scanner;

public class decToBin_Amazon {

	public static int sum = 0; 
	public static int i = 0;
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int inputinteger = input.nextInt();
		
		binconvertor(inputinteger);
		System.out.println(sum);
		
		
	}
	
	static void binconvertor(int inputint){
		int reminder;	
	
	if(inputint <=0){
		System.out.print(inputint);
		return;
	}
	else{
		reminder= inputint % 2;
	sum = sum * 10 + reminder;
	
	binconvertor(inputint/2);
	}
	
		
		
		
	}
}
