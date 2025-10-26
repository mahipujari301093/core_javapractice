package polymorphism;

public class MainOverloadingExample {

	// Standard main method - JVM calls this one
	public static void main(String[] args) {
		System.out.println("Main method with String[] args");

		// Calling other overloaded main methods manually
		main(10);
		main("Vishal");
	}

	// Overloaded version 1
	public static void main(int a) {
		System.out.println("Main method with int parameter: " + a);
	}

	// Overloaded version 2
	public static void main(String name) {
		System.out.println("Main method with String parameter: " + name);
	}
}

/* 
   🔹 1. Can we overload main()?

   ✅ Yes, we can.

   You can create multiple main() methods in the same class with different parameter lists — this is method overloading.

*/