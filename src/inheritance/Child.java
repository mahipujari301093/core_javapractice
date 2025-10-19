package inheritance;

public class Child extends Parent {

	public void Dog() {

		System.out.println("Dog can bark -> Executed from child class");

	}

	public static void main(String[] args) {

		Child c = new Child();
		c.eat(); // from Grandparent class
		c.walk(); // from parent class
		c.Dog(); // from child class

	}

}
