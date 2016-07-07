package Sample;

import java.util.Scanner;

//For given integer, the output should be 
//1	*		2 	*		3	*
//				***			***
//				*			*****
//							***
//							*

public class OddNoStar_Amazon {

	public static void main(String args[]){
		System.out.println("Enter the Integer value");
		Scanner input = new Scanner(System.in);
		int inputInteger = input.nextInt();
		int maxNoOfLines = (inputInteger*2)-1;
		int maxNoofStars = maxNoOfLines;
		int startStar = 1;
		boolean reverse = false;
		for(int i =0; i < maxNoOfLines; i++){
			int currentLineStar = (startStar * 2) -1;
			if(currentLineStar<maxNoofStars && !reverse){
				startStar +=1;
			}else{
				startStar -=1;
				reverse = true;
			}
			printstar(currentLineStar);
		}
		
		
		
	}
	
	static void printstar(int noOfStar){
		for(int i = 0; i<noOfStar ; i++){
		System.out.print("*");
		}
		System.out.print("\n");
	}
}
