package Pratice_Java;

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
	        // banana.makeBananaTree();
	    }
	}


