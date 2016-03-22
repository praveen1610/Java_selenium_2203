import java.util.Scanner;

public class Palindrome {

	public static void main(String args[]){
		System.out.println("Input string to check its palindrome");
		Scanner inputsting = new Scanner(System.in);
		String input = inputsting.nextLine();
		int middle = (input.length()-1)/2;
		int start = 0;
		int end = input.length()-1;
		int i;
		for(i = start; i<middle; i++){
			if(input.charAt(i) == input.charAt(end))
				end--;
			else
				break;			
		}
		if(i == middle){
			System.out.println(input+" is a palindrome");
			
		}else
			System.out.println(input+" is a not palindrome");

	}
}
