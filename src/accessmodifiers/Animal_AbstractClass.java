package accessmodifiers;

public abstract class Animal_AbstractClass {

	public void eat()  // Complete method (Non-Abstract method)
	{

		System.out.println("Animal is eating");
	}

	
	
	public abstract void sound(); // Incomplete Method (Abstract Method)

	// This method must be implemented in any concrete subclass (like Dog_AbstractClass).
		
}


/*
Abstract Class – Standard Definition
✅ Correct Understanding (Refined Explanation)

When we have only partial information about a functionality,
we declare the class as abstract and define abstract (incomplete) methods inside it.

An abstract class can contain:


✅ Abstract methods → methods declared without implementation
✅ Non-abstract methods → methods with complete implementation

Later, when we get the complete implementation details,
we create a child class that extends the abstract class and provides implementation for all abstract methods.

We cannot create an object of an abstract class because it may contain incomplete methods (abstract methods).

But we can create an object of the child class that completes the implementation.

An abstract class acts as a blueprint/template for other classes.

 */
