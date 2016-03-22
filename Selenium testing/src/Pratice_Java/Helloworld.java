package Pratice_Java;

public class Helloworld {


public void second(){
	System.out.println("second Class from helloworld class");
}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*System.out.println("hello World"); 
		int a = 5;
		int b = 10;
		int c = a + b;
		System.out.println("the value of c is " + c);*/
		Helloworld newobj = new Helloworld();
		newobj.second();
		
		Puppy myPuppy =new Puppy("hellotommy");
		
		
		myPuppy.setAge(2);
		myPuppy.getAge();
		
		Puppy myPuppy1 =new Puppy("pad");
		myPuppy1.setAge(5);
		myPuppy1.getAge();
		
		Session_1 objsession = new Session_1();
		objsession.method(5,5);
	}

}
