package Pratice_Java;
//This will be a Method overload or Polymorphism
	public class polymorphiism {
    
		public void method(){
			System.out.println("Inside first method");
		}
		
		public void method(int a){
			System.out.println("Inside second method" + a);
		}
	    public static void main(String[] args) {
	    	polymorphiism objectors = new polymorphiism();
	    	objectors.method();
	    	objectors.method(5);
	        
	    }
	}
