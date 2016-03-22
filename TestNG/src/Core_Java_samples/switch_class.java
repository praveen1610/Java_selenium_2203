package Core_Java_samples;

import java.util.Scanner;

public class switch_class {
public static void main (String[] args){
	//Input Int
	System.out.println("Give Interger value and press enter:");
	Scanner input_int = new Scanner(System.in);
	int a = input_int.nextInt();
	System.out.println("Inputed Int is " +a);

	//Input String
	System.out.println("Give Text and press enter:");
	Scanner input = new Scanner(System.in);
	String a1 = input.nextLine();
	System.out.println("Inputed string is" +a1);
	
	switch(a){
	case 1:
		System.out.println("given Input is 1");
		break;
	
	case 2:
		System.out.println("Given Input is 2");
		break;
	
	case 3:
		System.out.println("Given Input is 3");
		break;
		
	default:
		System.out.println("Default case" +a);
	}
}

}
