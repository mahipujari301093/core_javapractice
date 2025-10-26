package accessmodifiers;

public abstract class Animal_AbstractClass {

	public void eat() { // Complete method (Non-Abstract method)
		System.out.println("Animal is eating");
	}

	
	
	public abstract void sound(); // Incomplete Method (Abstract Method)

	// This method must be implemented in any concrete subclass (like Dog_AbstractClass).
		
}


/*

 ✅ Your Correct Understanding (Refined Explanation)

When we have only partial information about a functionality,
we declare the class as abstract and also define abstract (incomplete) methods inside it.

The abstract class can have:

Complete methods → fully defined (common behavior).

Incomplete (abstract) methods → only declared, not implemented yet.

When we later get the full information about how the functionality should work,
we create a child class that extends the abstract class and implements all the abstract methods.

We cannot create an object of an abstract class because it is incomplete (contains abstract methods).
But we can create an object of the child class (which completes the functionality).

It is used as a blueprint for other classes, and you cannot create an object of it.
 
 🧠 Key Points to Remember
Concept	Explanation

Abstract Class:	    Used when we have partial information about functionality
Abstract Method: 	Declared without body; must be implemented by subclass
Concrete Method:	Declared with body; inherited by subclass
Instantiation:	    Cannot create object of abstract class directly
Purpose	Provides a template or base structure for subclasses
 
 🧠 In one line:

Abstract class = a half-defined template that subclasses complete.
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 */
