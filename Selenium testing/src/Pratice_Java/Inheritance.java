package Pratice_Java;


class a {

	public void add(){
		int a = 10, b = 20;
		int c = a + b;
		System.out.println("Value of c is " +c);
	}
}
class b extends a {
	public void sub(){
		int a = 10, b = 20;
		int d = b -a;
		System.out.println("value of d is "+d);
	}
}
public class Inheritance {
	public static void main (String args[]){	
		a objects = new b();
		objects.add();
		
		
		b objects1 = new b();
		objects1.sub();
		
	}

}
