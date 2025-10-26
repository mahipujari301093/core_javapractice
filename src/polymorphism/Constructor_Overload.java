package polymorphism;

public class Constructor_Overload {

	// Instance variables
	String name;
	int age;

	// Constructor 1: Without arguments
	public Constructor_Overload() {
		System.out.println("This is a no-argument constructor");
	}

	// Constructor 2: With arguments
	public Constructor_Overload(String n, int a) {
		name = n;    // Assigning constructor arguments to instance variables
		age = a;     // Assigning constructor arguments to instance variables
		System.out.println("This is a parameterized constructor");
		System.out.println("Name: " + name + ", Age: " + age);
	}

	public static void main(String[] args) {

		Constructor_Overload s1 = new Constructor_Overload(); // Calls no-argument constructor
		Constructor_Overload s2 = new Constructor_Overload("Vishal", 25); // Calls parameterized constructor
	}
}
