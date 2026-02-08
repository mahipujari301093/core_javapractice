package casting;

public class Dog extends Animal {

	public void bark()

	{

		System.out.println("Dog is barking");

	}


	public static void main(String[] args) {


		Animal a = new Dog(); // Upcasting (Child object → Parent reference)
		a.eat();  //a is the parent reference, so we can only access methods defined in the parent class (Animal).

		// a.bark(); // ❌ Not allowed (only parent methods accessible because ref will decide what you can access)

	}

}

/*

 ✅ Polished Explanation Version

Dog is a subclass of Animal.

When we write Animal a = new Dog();,
a child object is assigned to a parent reference. This is called upcasting.

After upcasting, only the methods available in the parent class(Animal) can be accessed using the reference variable.

Child-specific methods cannot be accessed unless we downcast the reference back to the child type.

Upcasting is done automatically by Java (implicit).

✅ Memory Trick 🧠
Reference decides what you can access.
Object decides what actually runs.

 */
