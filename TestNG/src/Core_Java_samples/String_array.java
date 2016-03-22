package Core_Java_samples;

import java.util.Date;
import java.util.Scanner;

public class String_array {
	public static void main(String[] args){
		char[] nameArray = {'a', 'e','i', 'u','t'};
		String name = new String(nameArray);
		System.out.println(name);
		
		//Concatinare two stings using string builder
		Scanner inputA = new Scanner(System.in);
		String a =inputA.nextLine().trim();
		Scanner inputB = new Scanner(System.in);
		String b =inputB.nextLine();
		StringBuilder sb = new StringBuilder();
		String con = sb.append(a).append(b).toString();
		System.out.println(con);
		
		//Concatinare two string by converting to char
		System.out.println("String to Charater conversion");
		char[] c = a.toCharArray();
		char[] d = b.toCharArray();
		String concatenate = new String(a+b);
		System.out.println(concatenate);
		Date outputdate = new Date();
		System.out.println(outputdate.toString());
		for(int i=0; i<c.length; i++){
			System.out.print(c[i]);
			}
		for(int j=0;j<d.length;j++){
			System.out.print(d[j]);	
		}
		
	}

}
