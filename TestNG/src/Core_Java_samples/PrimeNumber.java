package Core_Java_samples;

public class PrimeNumber {

	 public static void main(String[] args) {

	  int num = 20, count;

	  for (int i = 1; i <= num; i++) {
	   count = 0;
	   System.out.println("I is "+i);
	   for (int j = 2; j <= i / 2; j++) {
		   System.out.println("J is "+j);
	    if (i % j == 0) {
	     count++;
	     break;
	    }
	   }

	   if (count == 0) {
	    System.out.println("Output "+i);
	   }
	  }
	 }
	}
