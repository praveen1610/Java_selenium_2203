package Core_Java_samples;


public class String_Reversing_Sentence {

	public static void main(String[] args) {
		
	String a = "Praveen is working solarwinds, its a good company";
		String b[] = a.split(" ");
		
		for(int i = b.length-1; i > -1 ; i--){
			
			char[] stringarray = b[i].toCharArray();
			stringarray[0] = Character.toUpperCase(stringarray[0]);
			//b[i] = new String(stringarray);
			b[i]= stringarray.toString();
			System.out.print(b[i]+" ");

		}
	
	}
	
}
