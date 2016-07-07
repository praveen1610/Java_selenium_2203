package Sample;

public class SecondLargest {
	
	public static void main(String args[]){
		int a[] = {5,6,9,3,7,2,56,98,31,78,25};
		int largest = a[0];
		int secondlargest= a[0];
		
		for(int j = 0; j<a.length; j++){
			if(largest<a[j]){
				largest = a[j];
			}else if(secondlargest < largest && secondlargest < a[j]){
				secondlargest = a[j];
			}
			
			}
		
		System.out.println(largest+"   "+secondlargest);
	}

}
