
public class Array_ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {56,52,20,67,65,78,94,23,21};
		int i,j;
		for(i=0; i<input.length; i++){
			//System.out.println("Loop for compare start " +input[i]);
			for(j=0;j<input.length-1;j++){
					//System.out.println("Comparing "+input[j]+" with "+input[j+1]);
					if(input[j] < input[j+1]){
						//System.out.println("Value "+input[j]+" is greater than "+input[j+1]);
						int a = input[j];
						input[j] = input[j+1];
						input[j+1] = a;
						//System.out.println("Array after replacing");
						for(int k=0; k<input.length; k++){
							//System.out.println(input[k]);
							}
					}
			}
			//System.out.println("Left J for loop");
		
		}
			System.out.println("FINALlllll");
			for(i=0; i<input.length; i++){
				System.out.println(input[i]);
				}
	}
}
