package casting;

public class Dog extends Animal {

	public void bark() {

		System.out.println("Dog is barking");

	}

	public static void main(String[] args) {

		Dog d = new Dog(); // child class object

		Animal a = new Dog(); // Upcasting (Child object → Parent reference)
		a.eat();
		// a.bark(); // ❌ Not allowed (only parent methods accessible)

	}

}

/*
 * 
 * 💡 Definition of Upcasting:
 * 
 * Upcasting means converting a child class object into a parent class
 * reference.
 * 
 * Upcasting is done It is done automatically (implicit casting).
 * 
 🔹 Explanation:

Dog is a subclass of Animal.

When we write Animal a = new Dog();,
we are assigning a child object to a parent reference → this is upcasting.

After upcasting, only parent class methods (eat()) can be called.
Child methods (bark()) are hidden unless you downcast back
  
  
 
 */
