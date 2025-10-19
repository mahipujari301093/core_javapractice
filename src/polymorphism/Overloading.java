package polymorphism;

public class Overloading {


	    // Method 1: No parameters
	    public void m1() {
	        System.out.println("Silent");
	    }

	    // Method 2: One String parameter
	    public void m1(String classroom) {
	        System.out.println("Angry");
	    }

	    // Method 3: One int parameter
	    public void m1(int salary) {
	        System.out.println("Happy");
	    }

	    public static void main(String[] args) {
	        Overloading ref = new Overloading();
	        ref.m1();            // Calls Method 1 → Output: Silent
	        ref.m1("School");    // Calls Method 2 → Output: Angry
	        ref.m1(20000);       // Calls Method 3 → Output: Happy
	    }
	}


/*
    Same method name m1 , but Different parameters
    
    🧠 What Happens Internally:

When you compile this code:

The compiler checks all available m1() methods.

Based on the arguments you pass, it determines which version to call.

That decision is made before the program runs (at compile time).

Therefore, it’s called compile-time polymorphism or static binding.


🔸 Compare it with Overriding:
Concept   	  When decided	  Who decides	      Example
Overloading	  Compile time	  Compiler	          show(int) vs show(String)
Overriding	  Runtime	      JVM	              Parent vs Child method


💡 In short:

Overloading is compile-time polymorphism because
the compiler determines which version of the method will execute based on parameters during compilation, not at runtime.





 */ 
