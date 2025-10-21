package casting;

public class Car extends Vehicle {
	
	
	public void honk() {
        System.out.println("Car is honking");
             
    }

	public static void main(String[]args)
	{
		// Upcasting: Child object → Parent reference
        Vehicle v = new Car();   // parent reference pointing to child object

        v.start();               // works (method from Vehicle)
        // v.honk();             // ❌ not allowed (only parent methods visible)

        // Downcasting: Parent reference → Child reference
        Car c = (Car) v;         // explicit cast (Manually did)
        c.honk();                // ✅ Works now
        c.start();               // ✅ Works (inherited from Vehicle)
		
	}
	
	
	
}

/*

Car c = (Car) v; → Downcasting: Converts parent reference back to child type.

Now c.honk(); works because we told Java this parent object is actually a Car.



*/