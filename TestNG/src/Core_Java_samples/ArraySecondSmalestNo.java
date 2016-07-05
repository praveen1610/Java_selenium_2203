package Core_Java_samples;

public class ArraySecondSmalestNo {
	public static void main(String args[]){
	
		int a[] = {56,59,36,12,45,86,78};
		int largest = a[0];
		int secondLargest = a[0];
		
		for(int i = 0; i < a.length; i++){
			if(a[i]	>	largest){
				secondLargest = largest;
				largest = a[i];
			} else if (a[i] > secondLargest){
				secondLargest = a[i];
			}
		}
		System.out.println(largest+" "+secondLargest);
		
	}
}
