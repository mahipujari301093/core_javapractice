package inheritance;

public class Dog extends Animal {

	public void bark() 
	{

		System.out.println("Dog can bark-> From child class");

	}

	public static void main(String[] args)

	{

		Dog g = new Dog();

		g.eat(); // from parent class
		g.bark(); // from child class
	}

}
