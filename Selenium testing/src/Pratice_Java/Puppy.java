package Pratice_Java;
/*Constructor:
 * Each time a new object is created, at least one constructor will be invoked. The main rule of constructors is that they
should have the same name as the class. A class can have more than one constructor. */
	
	public class Puppy{

		int puppyAge;
	
		public Puppy(String name){
			// This constructor has one parameter, name.
			System.out.println("Passed Name is :"+ name );
			}
		
	
		public void setAge(int age ){
			puppyAge = age;
			}
	
		public int getAge(){
			System.out.println("Puppy's age is :"+ puppyAge );
			return puppyAge;
			}
	
		public static void main(String[]args){
			/* Object creation */
			Puppy myPuppy =new Puppy("tommy");
				
			/* Call class method to set puppy's age */
			myPuppy.setAge(2);
			/* Call another class method to get puppy's age */
			myPuppy.getAge();
			/* You can access instance variable as follows as well */
			System.out.println("Variable Value :"+ myPuppy.puppyAge );
			Helloworld ob= new Helloworld();
			ob.second();
			//ob.main(null);
	}
}





