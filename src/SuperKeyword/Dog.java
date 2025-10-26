package SuperKeyword;

public class Dog extends Animal {
	
	
	String name = "Dog";
	
	
	 // Child class constructor
    public Dog()
    
      {
        super(); // Calls parent class constructor
        System.out.println("Dog constructor called");
      }
	
	public  void display() 
	
	  {
        super.display(); // Calls parent class method by using super keyword 
        System.out.println("This is a dog");
      }
	
	 public void showNames() 
	   {
	        System.out.println("Child name: " + name);      // Child variable
	        System.out.println("Parent name: " + super.name); // Parent variable
	    }

	    public static void main(String[] args) {
	        Dog d = new Dog();      // Calls constructor
	        d.display();            // Calls method
	        d.showNames();          // Access parent and child variables
	    }

}
