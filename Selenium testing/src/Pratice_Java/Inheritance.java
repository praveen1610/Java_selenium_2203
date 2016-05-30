package Pratice_Java;

class a {
	int c;
	public void add(int a, int b){
		c = a + b;
		System.out.println("Value of c is " +c);
	}
}

class b extends a {
	public void sub(){
		int a = 10; int b = 6;
		c = b -a;
		System.out.println("value of d is "+c);
	}
}
public class Inheritance {
	public static void main (String args[]){	
		b objects1 = new b();
		objects1.add(5,6);
		objects1.sub();
		
	}

}
