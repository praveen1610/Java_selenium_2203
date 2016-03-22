package Pratice_Java;

public class Session_1 {
	public static void method(int a, int b)
	{
		int c= a +b; 
		System.out.println("Added integers and result is " +c); 
	}
	public static void method1()
	{
		System.out.println("inside second method"); 
	}
	public static void main(String args[])
	{
	    method(5,5);
	    method1();
	}
}
