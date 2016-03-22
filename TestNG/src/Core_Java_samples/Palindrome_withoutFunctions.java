package Core_Java_samples;

import java.util.Scanner;

public class Palindrome_withoutFunctions {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		int start = 0;
		int end = s1.length()-1;
		int middle = (start+end)/2;
		int i;
		for(i=start; i<=middle; i++){
			if(s1.charAt(start)==s1.charAt(end)){
				start++;
				end--;
			}else {
				break;
			}
		}
		if(i == middle+1){
			System.out.println("its palindrome using loop resever " +middle+i);
		}
		else {	
			System.out.println("its not palindrome using loop resever " +middle+i);
		}	
		
	}

}
