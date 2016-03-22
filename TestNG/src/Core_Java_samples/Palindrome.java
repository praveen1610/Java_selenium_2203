package Core_Java_samples;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	String a = input.nextLine();

	//Using String Builder and Reverse function
		StringBuilder s2 = new StringBuilder(a);
		s2.reverse();
		if(a.equals(s2.toString())) {
			System.out.println("its palindrome " +a+ " " +s2.toString());
		}
		else {	
			System.out.println("not a palindrome " +s2.toString());
		}
	
	//Revesing using for loop
		String b= "";
		for(int i=a.length()-1; i<=0; i--){
			b = b + a.charAt(i);
			System.out.println(b + i);
		}
		if(a.equals(b)){
			System.out.println("its palindrome using loop resever " +a+ " " +b);
		}
		else {	
			System.out.println("its not palindrome using loop resever " +b);
		}
			
}
}
