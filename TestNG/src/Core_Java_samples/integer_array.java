package Core_Java_samples;

public class integer_array {

	public static void main(String[] args) {
		int[] intarray = new int[5];
		int n,i=0;
		for(n=0; n<intarray.length; n++)
		{
			intarray[n] = n;
			//System.out.println(n);
		}
		
		while(i< n){
			System.out.println("Array Value of n: "+intarray[i]);
			i++;
		}
	}

}
