package polymorphism;

public class Child_Override extends Parent_Override {
	
	
	
	public void ShowMessage()
	{
		
		System.out.println("Message from child  class");
		
	}
	
	
	public static void main(String[]args)
	{
		Parent_Override p = new Parent_Override();       //parent object
		p.ShowMessage();
		
		
		Child_Override c = new Child_Override();         // child object
		c.ShowMessage();
		
		Parent_Override pc = new Child_Override();      // Parent reference, Child object
		pc.ShowMessage();                // Calls child version (Runtime polymorphism)decided at runtime
		
		// here pc is the parent ref and Parent reference can point to any child object
		
	}
	
/*
 
 💡 Think of it like this:

There are two parts in this line:

Left side (Parent_Override pc) → this is the reference type

Right side (new Child_Override()) → this is the object type

	
Parent_Override : Reference type — decides what methods and variables are accessible at compile time.	
 	
new Child_Override() Actual object created in memory — decides which version of the method will be executed at runtime. 	
 	
🖥️ Result:

Even though the reference type is Parent,
the Child’s method runs because the object type is Child.


🧠 In short:

Reference type->	Tells what methods are available.
Object type->	Tells which version of the method runs at runtime.
Result	Child’s method runs if the object is a child, even if the reference is parent type. 	
 	
 	
💡 In short:

Overloading = Compile-time polymorphism → Compiler decides which method to call based on parameters.

Overriding = Runtime polymorphism → JVM decides which method to call based on actual object type at runtime. 	
 	
 	
Note: No — you do not always need a parent reference and child object to demonstrate method overriding.

Case 2: Parent reference, Child object (runtime polymorphism)

Parent_Override pc = new Child_Override();
pc.ShowMessage();  // Calls child version


✅ This is runtime polymorphism / dynamic method dispatch.

This is not required to demonstrate overriding, but it is used to show the power of polymorphism:

Parent reference can point to any child object

JVM decides which method to call at runtime based on actual object type
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 		
 */
	
	
	
	

}
