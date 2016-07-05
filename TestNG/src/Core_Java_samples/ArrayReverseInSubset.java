package Core_Java_samples;

public class ArrayReverseInSubset {

	public static void main(String args[]){
		int a[] = {1,2,3,4,5,6,7,8,9};
		int b[] = reverseArray(a,4);
		for(int c: b){
			System.out.print(c+" ");
		}
		
	}
	private static int[] reverseArray(int[] A, int k) {
        for (int i = 0; i < A.length; i += k) {
            int left = i;
            // in case right larger than A.length
            int right = Math.min(i + k - 1, A.length - 1);

            // reverse sub array
            while (left < right) {
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp;

                left++;
                right--;
            }
            for(int c: A){
    			
            	System.out.print(c+" ");
            	
    		}
            System.out.println("\n");
        }
    
        System.out.println("First return");
        return A;
    }
}
