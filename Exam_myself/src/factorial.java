import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int factorialnumber = input.nextInt();
		for(int j=factorialnumber-1; j>1; j--){
			factorialnumber = factorialnumber * j;
			
		}
		System.out.println(factorialnumber);
	}

}
