package Core_Java_samples;

import java.util.Scanner;

public class Array_Remove_Duplicate {
	public static void main(String[] args){
		
		 //Remove Below comment to get input from user
		 /*Scanner input = new Scanner(System.in);
		   int[] inputarry = new int[10];
		 for(int i=0; i<10; i++){
			inputarry[i]=input.nextInt();
		}*/
		
		int[] inputarry = {56,56,56,45,59,54,54,53,54,45};
		//System.out.println("Input is completed: The given input is:\n");
		
		for(int i=0; i<inputarry.length; i++){
	//		System.out.println(inputarry[i]);
		}
		System.out.println("output is----------------\n");
		for(int i=0;i<inputarry.length;i++){
			//System.out.println("Loop for compare start " +inputarry[i]);
			for(int j=i+1; j<10;j++){
				if(inputarry[i] ==inputarry[j])
				inputarry[i] = -1;
			}
		}
		for(int i=0; i<10; i++){
			if(inputarry[i]  != -1)
		System.out.println(inputarry[i]);
		}
	}

}
