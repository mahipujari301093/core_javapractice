package interface_practice;

public class Dog implements Animal {
	
	public void eat()
	{
		
		System.out.println("Dog is eating");
	}
	
	public void sound()
	{
		
		System.out.println("Dog says Woof!");
	}
	
	public static void main(String[]args)
	{
		
		Animal a = new Dog();  // interface reference, Dog object
	
		a.eat();
		a.sound();
		
		
	}

}


/*

🔑 In short:

We create an interface reference and class object
to achieve polymorphism — so the same reference can point to different objects that follow the same behavior (interface).





*/