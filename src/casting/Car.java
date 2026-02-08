package casting;

public class Car extends Vehicle {
	
	
	public void honk()

    {
        System.out.println("Car is honking");
             
    }

	public static void main(String[]args)
	{
		// Upcasting: Child object → Parent reference
        Vehicle v = new Car();   // parent reference pointing to child object

        v.start();               // works (method from Vehicle)
        // v.honk();             // ❌ not allowed (only parent methods visible)

        // DownCasting: Parent reference → Child reference
        Car c = (Car) v;         // explicit cast (Manually did)
        c.honk();                // child method now accessible through child reference
        c.start();               // parent method also accessible through child reference
		
	}
	
	
	
}

/*

Car c = (Car) v; → DownCasting: Converts parent reference back to child type.

Now c.honk(); works because we told Java this parent object is actually a Car.
👉 explicit cast done manually by the programmer

✅ Memory Formula 🧠


Parent ref → Child object  = Upcasting done automatically by Java (implicit)
Parent ref → back to Child = Downcasting done manually by programmer (explicit)

Why c.start() also works? Because Car inherits from Vehicle.


*/