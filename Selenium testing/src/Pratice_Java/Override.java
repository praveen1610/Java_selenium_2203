package Pratice_Java;
//This will be a Method overload or Runtime Polymorphism
	class Fruit {
	    
	    public void show() {
	        System.out.println("Fruit");
	    }
	}

	class Banana extends Fruit {
	    
	    //Override
	    public void show() {
	        System.out.println("Banana");
	    }
	    
	    public void show(int a) {
	    	
	        System.out.println("Banana");
	    }
	    
	    public void makeBananaTree() {
	        System.out.println("Making a tree");
	    }
	}

	public class Override {

	    public static void main(String[] args) {
	        Fruit bananas = new Banana();
	        
	        bananas.show();
	        
	        // The following WILL NOT work;
	        // Variables of type Fruit know only
	        // about Fruit methods.
	        // bananas.makeBananaTree(); to make it work we need to do type casting as below
	        ((Banana) bananas).makeBananaTree(); 
	    }
	}


