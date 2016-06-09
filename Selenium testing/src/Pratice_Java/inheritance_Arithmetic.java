package Pratice_Java;

class Arithmetic{
		public int add(int a, int b){
        int c = a+b;
       return c;
   }
}

class Adder extends Arithmetic{
	public int add(int a, int b){
       int c = a+b;
       return c;
}
}
	
public class inheritance_Arithmetic {
	public static void main (String args[]){
       	Adder a = new Adder();
         System.out.println("My superclass is: "+ a.getClass().getSuperclass().getName());
	             System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
	        }
	    }