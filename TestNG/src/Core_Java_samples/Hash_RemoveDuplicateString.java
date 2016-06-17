package Core_Java_samples;

import java.util.HashMap;
import java.util.Scanner;

public class Hash_RemoveDuplicateString {

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		HashMap<Character, Integer> character = new HashMap<Character, Integer>();
		
		for(int i = 0 ; i < s.length(); i++){
		char c = s.charAt(i);

		if(!character.containsKey(c)){
			character.put(c,1);
			System.out.print(c);
			}
		}
	} 
}
