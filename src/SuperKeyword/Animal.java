package SuperKeyword;

public class Animal {
	
	
	   String name = "Animal"; 

	    // Parent class constructor
	   public Animal() 
	    {
		   
	        System.out.println("Animal constructor called");
	    }

	   //Non static Method
	   public void display() 
	    {
		   
	        System.out.println("This is an animal");
	    }
	   
/* Correct Definition of super

   super is a keyword in Java used by a child class to refer to its immediate parent class. It is used to:

   Call the parent class constructor (super()), usually from the child class constructor.

   Access a parent class method (super.methodName()), especially when it is overridden in the child class.

   Access a parent class variable (super.variableName), especially when it is hidden by a variable with the same name in the child class.
   
   Key Points: 

   super() must be the first statement in a child constructor if used.

   super is used inside the child class only.

   It helps in reusing code from parent class, avoiding duplication, and resolving naming conflicts.

*/
	   
	}
	
	


