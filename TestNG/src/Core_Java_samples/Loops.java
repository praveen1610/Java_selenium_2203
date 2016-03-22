package Core_Java_samples;

public class Loops {
	public static void main(String[] args){
		int i=1, a=1, times = 5;
		while(i<=times){
			System.out.println("Inside while loop " +i);
			++i;
			//System.out.println("Value of i "+i);
			}
		
		do{
			System.out.println("Do while inside " +a);
			++a;
		}while(a<=times);
		
		for(a=1;a<=times; a++)
		{
			System.out.println("Inside for loop " +a);
		}
	}

}
