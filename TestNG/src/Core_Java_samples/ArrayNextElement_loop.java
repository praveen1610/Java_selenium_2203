package Core_Java_samples;

public class ArrayNextElement_loop {
	public static void main(String args[]){
		//int a[] = {3,4,5,2,7,5,7,3,8,2,5,7,9,1,3};
		int a[] = {20,10,4,3,8,9,30};
		int len = a.length;
		for(int i=0; i<len; i++){
			int result = 0;
			for(int j=i+1; j<len; j++){
				//for(int j=0; j<len; j++){
				//if(a[j]<a[i]){
				if(a[j]>a[i]){
					result = a[j];
					//System.out.print( result +" ");
					break;
				}
				
				
			}
			System.out.print( result +" ");
		}
		
	}

}
//2,2,2,1,5,3,3,2,2,1,1,1,1,0,0,