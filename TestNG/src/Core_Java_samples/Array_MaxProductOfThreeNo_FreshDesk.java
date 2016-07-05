package Core_Java_samples;

import java.util.Scanner;

//http://stackoverflow.com/questions/20550037/find-maximum-product-of-3-numbers-in-an-array

public class Array_MaxProductOfThreeNo_FreshDesk {

	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int arraysize = input.nextInt();
		int a[] = new int[arraysize];
		for(int i = 0; i< arraysize; i++){
			 a[i] = input.nextInt();
		}
		
		//Sorting Array
		for(int i = 0; i < a.length ; i++){
			for(int j = 0; j < a.length ; j++){
				if(a[i]> a[j]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println("********SORTED ARRAY IS****************");
		for( int arr : a){
		System.out.println(arr);
		}
		
		int maxOne = a[0] * a[1] * a[2];
		int maxTwo = a[a.length-1] * a[a.length-2] * a[0];   //This is to find if there is a negative no 5,6,-7,-8,4
		if( maxOne > maxTwo){
			System.out.println(maxOne);
		}else {
			System.out.println(maxTwo);
		}
		
		System.out.println("**********PRINT BOTH OUTPUT**************");
		System.out.println(maxOne);
		System.out.println(maxTwo);
		
	}
}
