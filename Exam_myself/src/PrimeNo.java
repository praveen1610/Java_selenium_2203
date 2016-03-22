
public class PrimeNo {
	public static void main(String args[]){
		
		
		int i =8, count=0;
		for(int j = 2; j < i/2; j++){
			if(i%j == 0){
				count++;

				break;
				
			}
		}
		if(count == 0)
		{
			System.out.println("its prime no "+i);
		}else
			System.out.println("Not a prime "+i);
		
	}

}
