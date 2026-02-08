package accessmodifiers;

public class Dog_AbstractClass extends Animal_AbstractClass {
	
	
	// Child class – full information

	@Override
	public void sound()    // Subclass completes abstract method
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
