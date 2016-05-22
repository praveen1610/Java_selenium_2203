package Core_Java_samples;

public class Array_commonElements_Sorted {
	public static void main(String args[]){
		int a[] = {1,2,3,4,5,6,7,8};
		int b[] = {3,6,7,9,12};
		int i = 0,j = 0;
		while(i< a.length && j < b.length){
			if(a[i] == b[j]){
				System.out.println(a[i]);
				i++;
			}
			else if (a[i] > b[j]){
				j++;
			}
			else if (a[i] < b[j]){
				i++;
			}
			
		}
	}

}
