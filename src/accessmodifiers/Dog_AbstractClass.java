package accessmodifiers;

public class Dog_AbstractClass extends Animal_AbstractClass {
	
	
	// Child class – full information

	@Override
	public void sound()    // Implementing the abstract method from the parent class
	{
		
		System.out.println("Dog says Woof!");
	}
	
	
	public static void main(String[]args)
	{
		Dog_AbstractClass d = new Dog_AbstractClass();
	        d.eat();                  // Complete method from abstract class
	        d.sound();                // Implemented abstract method
		
		
	}

}
