package Core_Java_samples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class int_SumofIndividual {
	
	public static List<Integer> arrayconvertor(int input){
		int i =0;
		List<Integer> arraynumber = new ArrayList<Integer>();
		while(input > 0 ){
			i = input % 10;
			input = input / 10;
			arraynumber.add(i);
		}
			Collections.reverse(arraynumber);
			return arraynumber;
		}
	
	public static int addingElements(int a, int b){
		int c = 0 , d = 1;
		while( d > 0){
		c = a + b;
		d = a = c / 10;
		b = c % 10;
		}
		return c;
	}
	public static void main(String args[]){
		int a = 89706;
		int b = 56321;
		int result_int = 0;
		List<Integer> result_array = new ArrayList<Integer>();
		List<Integer> a_array = new ArrayList<Integer>(arrayconvertor(a));
		List<Integer> b_array = new ArrayList<Integer>(arrayconvertor(b));
		
		System.out.println(a_array);
		System.out.println(b_array);
		
		
		if(a_array.size()==b_array.size()){
			
			for( int i =0; i < a_array.size(); i++){
				result_int = addingElements(a_array.get(i),b_array.get(i));
				result_array.add(result_int);
				//	Collections.reverse(result_array);
				System.out.println(result_array);
			}
		} 
		
		else { 
			System.out.println("Array are not equal");
		}
		
		
	}

}
