package Core_Java_samples;

public class Array_CommonElement_unsorted {
	public static void main(String args[]){
		int a[] = { 1,2,3,4,5,6,8,9,10};
		int b[] = { 2,6,9,8,5,8};
		for(int i = 0 ; i < a.length; i++){
			for(int j = 0; j < b.length; j++){
				if(a[i]==b[j]){
					System.out.println(a[i]);
					break;
				}
			}
		}
	}

}
