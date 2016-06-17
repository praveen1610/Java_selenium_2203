package Pratice_Java;

public class Interface {
	
	public interface a {
		
		public void add(int a, int b);
		public void sub();
	}

	public static class b implements a {
		public void add(int a, int b){
			int d = b +a;
			System.out.println("value of d is "+d);
			
		}
		public void sub(){
			int a = 10; int b = 6;
			int c = b -a;
			System.out.println("value of d is "+c);
		}
		
		public void multiply(int a, int b){
			int d = b *a;
			System.out.println("value of d is "+d);
			
		}
		
	}
		public static void main (String args[]){
			a objects1 = new b();
			//holderType variable = initializer Type
			//			a objects1;
			//			objects1 = new b();
			
			objects1.add(5,6);
			objects1.sub();
			((b) objects1).multiply(5,6);
			
		}
		
//		class shirt
//		class fullhandshirt : shirt
//		
//		shirt s = new fullhandshirt();
//		fullhad s = new shirt()

	}
