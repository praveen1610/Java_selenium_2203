package Core_Java_samples;

public class Array_largest_smallest {
	public static void main(String[] args){
		int number[] = new int[]{55,63,56,67,48,73,46,96,13,56,86};
		int smallest = number[0];
		int largest = number[0];
		
		for(int i=1; i<number.length; i++){
			if(number[i] > largest)
				largest = number[i];
						
			if(number[i] < smallest)
				smallest = number[i];
			//System.out.println(smallest);
			
			}
		System.out.println("Final " +largest);
		System.out.println("Final " +smallest);
		/*int last = number.length -1;
		for(int i=0;i<number.length;i++){
			int temp[] = number[];
			
		}*/
		
	}

}
