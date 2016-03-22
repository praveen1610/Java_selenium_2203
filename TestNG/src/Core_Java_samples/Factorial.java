package Core_Java_samples;

public class Factorial {
	public static void main(String[] args){
		int n = 4;
		int b=n;
		
		int i;
		for(i=1;i<n;i++){
			b = b * i;
			System.out.println(i);	
			System.out.println(b);
		}
	
	 System.out.println("Factorial of "+n+" is " +b);
    }
}
	